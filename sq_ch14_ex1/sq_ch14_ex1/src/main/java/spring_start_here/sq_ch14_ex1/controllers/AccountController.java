package spring_start_here.sq_ch14_ex1.controllers;

import org.springframework.web.bind.annotation.*;
import spring_start_here.sq_ch14_ex1.model.Account;
import spring_start_here.sq_ch14_ex1.model.TransferRequest;
import spring_start_here.sq_ch14_ex1.services.TransferService;

import java.util.List;

@RestController
public class AccountController {

    private final TransferService transferService;

    public AccountController(TransferService transferService) {
        this.transferService = transferService;
    }

    @PostMapping("/transfer")
    public void transferMoney(@RequestBody TransferRequest transferRequest) {
        transferService.transferMoney(transferRequest.getSenderAccountId(), transferRequest.getReceiverAccountId(), transferRequest.getAmount());
    }

    @GetMapping("/accounts")
    public Iterable<Account> getAccounts(@RequestParam(required = false) String name) {
        if (name == null) {
            return transferService.getAllAccounts();
        } else {
            return transferService.getAccountsByName(name);
        }
    }

    @GetMapping("/acc")
    public List<Account> getAccount(@RequestParam String name, @RequestParam Long id) {
        return transferService.getAccountsByNameIsNot(name, id);
    }

}

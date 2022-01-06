package spring_start_here.sq_ch13_ex1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import spring_start_here.sq_ch13_ex1.model.Account;
import spring_start_here.sq_ch13_ex1.model.TransferRequest;
import spring_start_here.sq_ch13_ex1.services.TransferService;

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
    public List<Account> getAccounts() {
        return transferService.getAccounts();
    }


}

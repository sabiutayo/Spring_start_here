package spring_start_here.sq_ch14_ex1.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring_start_here.sq_ch14_ex1.exceptions.AccountNotFoundException;
import spring_start_here.sq_ch14_ex1.model.Account;
import spring_start_here.sq_ch14_ex1.repositories.AccountRepository;

import java.math.BigDecimal;
import java.util.List;

@Service
public class TransferService {
    private final AccountRepository accountRepository;

    public TransferService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Transactional
    public void transferMoney(long senderAccountId, long receiverAccountId, BigDecimal amount) {
        Account sender = accountRepository
                .findById(senderAccountId).orElseThrow(() -> new AccountNotFoundException());
        Account receiver = accountRepository
                .findById(receiverAccountId).orElseThrow(() -> new AccountNotFoundException());
        BigDecimal senderNewAmount = sender.getAmount().subtract(amount);
        BigDecimal receiverNewAmount = receiver.getAmount().add(amount);
        accountRepository.changeAmount(senderAccountId, senderNewAmount);
        accountRepository.changeAmount(receiverAccountId, receiverNewAmount);

    }

    public Iterable<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public List<Account> getAccountsByName(String name) {
        return accountRepository.findAccountsByName(name);
    }
    public List<Account> getAccountsByNameIsNot(String name, Long id){
       return accountRepository.findByNameAndId(name, id);
    }
}

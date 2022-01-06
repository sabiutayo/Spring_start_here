package spring_start_here.sq_ch13_ex1.repositories;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import spring_start_here.sq_ch13_ex1.mappers.AccountMapper;
import spring_start_here.sq_ch13_ex1.model.Account;

import java.math.BigDecimal;
import java.util.List;

@Repository
public class AccountRepository {
    private final JdbcTemplate jdbc;

    public AccountRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public Account findAccountById(long id) {
        String sql = "SELECT * FROM account WHERE id=?";
        return jdbc.queryForObject(sql, new AccountMapper(), id);
    }

    public void changeAmount(long id, BigDecimal amount) {
        String sql = "UPDATE account SET amount=? WHERE id=?";
        jdbc.update(sql, amount, id);
    }

    public List<Account> findAllAccounts() {
        String sql = "SELECT * FROM account";
        return jdbc.query(sql, new AccountMapper());
    }
}

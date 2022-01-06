package spring_start_here.sq_ch13_ex1.mappers;

import org.springframework.jdbc.core.RowMapper;
import spring_start_here.sq_ch13_ex1.model.Account;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountMapper implements RowMapper<Account> {
    @Override
    public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        BigDecimal amount = rs.getBigDecimal("amount");
        return new Account().setId(id).setName(name).setAmount(amount);
    }
}

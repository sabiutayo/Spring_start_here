package spring_start_here.sq_ch13_ex1.model;

import java.math.BigDecimal;

public class Account {
    private int id;
    private String name;
    private BigDecimal amount;

    public int getId() {
        return id;
    }

    public Account setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Account setName(String name) {
        this.name = name;
        return this;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Account setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }
}

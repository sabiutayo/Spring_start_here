package com.springstarthere.sqch11payments.model;

public class Payment {
    private String id;
    private double amount;

    public String getId() {
        return id;
    }

    public Payment setId(String id) {
        this.id = id;
        return this;
    }

    public double getAmount() {
        return amount;
    }

    public Payment setAmount(double amount) {
        this.amount = amount;
        return this;
    }
}

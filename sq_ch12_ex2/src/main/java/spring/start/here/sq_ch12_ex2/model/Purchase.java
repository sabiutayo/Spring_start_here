package spring.start.here.sq_ch12_ex2.model;

import java.math.BigDecimal;

public class Purchase {
    private int id;
    private String product;
    private BigDecimal price;

    public int getId() {
        return id;
    }

    public Purchase setId(int id) {
        this.id = id;
        return this;
    }

    public String getProduct() {
        return product;
    }

    public Purchase setProduct(String product) {
        this.product = product;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Purchase setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }
}

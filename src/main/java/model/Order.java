package model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Order {
    private String id;
    private BigDecimal total;

    public Order(String id, BigDecimal total) {
        this.id = id;
        this.total = total;
    }
}

package model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class Product {
    private String name;
    private String id;
    private BigDecimal price;
    private BigDecimal total = BigDecimal.ZERO;


    private List<Product> products;

    private Product(ProductBuilder pb) {
        this.name = pb.name;
        this.id = pb.id;
        this.price = pb.price;
        this.products = pb.products;
    }

    public static class ProductBuilder {
        private String name;
        private String id;
        private BigDecimal price;
        private List<Product> products;

        public ProductBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder id(String id) {
            this.id = id;
            return this;
        }

        public ProductBuilder price(double price) {
            this.price = BigDecimal.valueOf(price);
            return this;
        }

        public ProductBuilder products(List<Product> products) {
            this.products = products;
            return this;
        }

        public Product build() {
            return new Product(this);

        }
    }


}

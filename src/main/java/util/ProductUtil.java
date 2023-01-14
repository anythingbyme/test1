package util;

import model.Product;
import model.StudentBuilder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ProductUtil {
    public static List<Product> createProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product.ProductBuilder().id("200").name("whopper").price(3.99).build());
        products.add(new Product.ProductBuilder().id("100").name("chk burger").price(4.99).build());
        products.add(new Product.ProductBuilder().id("100").name("chk burger").price(4.99).build());
        products.add(new Product.ProductBuilder().id("100").name("chk burger").price(4.99).build());
        products.add(new Product.ProductBuilder().id("300").name("fries").price(0.99).build());
        products.add(new Product.ProductBuilder().id("300").name("fries").price(0.99).build());
        products.add(new Product.ProductBuilder().id("300").name("fries").price(0.99).build());
        products.add(new Product.ProductBuilder().id("200").name("whopper").price(3.99).build());
        products.add(new Product.ProductBuilder().id("300").name("fries").price(0.99).build());
        return products;
    }

    public static Map<String, List<Product>> groupById(List<Product> products) {
        Map<String, List<Product>> m = new LinkedHashMap<>();
        for (Product p: products) {
            if (m.containsKey(p.getId())) {
                List<Product> ps = m.get(p.getId());
                p.setTotal(p.getTotal().add(p.getPrice()));
                ps.add(p);
                m.put(p.getId(), ps);
            }
            else {
                List<Product> p1 = new ArrayList<>();
                p.setTotal(p.getTotal().add(p.getPrice()));
                p1.add(p);
                m.put(p.getId(), p1);
            }
        }
        return m;
    }


}

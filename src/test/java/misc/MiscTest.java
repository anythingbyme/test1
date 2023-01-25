package misc;

import lombok.Data;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

class MiscTest {

    private Misc misc = new Misc();

    @Test
    void rShift() {
    }

    @Test
    void filterNames1() {
        List<String> names = List.of("aj", "ak", "raj", "su");
        misc.filterNames(names, s->s.length()>2);
    }

    @Test
    void filterNames2() {
        List<String> names = List.of("aj", "ak", "raj", "su");
        misc.filterNames(names, s->s.length()< 3);
    }

    @Test
    void transformNames1() {
        List<String> names = List.of("aj", "ak", "raj", "su");
        misc.trandformNames(names, s->s.toUpperCase());
    }



    @Test
    void rightShift() {
//        Assertions.assertEquals(8,3 << 2);

//        System.out.println(3 ^ 5);
        for(char c: "abc".toCharArray()) {
            System.out.println(c);
        }
        System.out.println((int)'a');
    }

    @Test
    void java8() {
        var l = List.of("aa","abc");

        Customer c1 = new Customer("1");
        c1.addOrder(createOrder("1", 15));
        c1.addOrder(createOrder("2", 30));
        c1.addOrder(createOrder("3", 40));//85

        Customer c2 = new Customer("2");
        c2.addOrder(createOrder("1", 10));
        c2.addOrder(createOrder("2", 5));
        c2.addOrder(createOrder("3", 80));//95

         Customer c4 = new Customer("4");
        c4.addOrder(createOrder("1", 1));
        c4.addOrder(createOrder("2", 5));
        c4.addOrder(createOrder("3", 0));//6

         Customer c3 = new Customer("3");
        c3.addOrder(createOrder("1", 1));
        c3.addOrder(createOrder("2", 5));
        c3.addOrder(createOrder("3", 8));//14

        CustomerSvc cs = new CustomerSvc();
        cs.register(c1);
        cs.register(c2);
        cs.register(c3);
        cs.register(c4);
        List<Customer> result = cs.rankByTotal();

        for (Customer c: result) {
            System.out.printf("CustId=%s Total=%s\n", c.getId(), c.getTotal().toString());
        }
    }

    @Data
    static class CustomerSvc {

        private List<Customer>  customers = new ArrayList<Customer>();
        public void register(Customer customer) {
            customers.add(customer);
        }

        public List<Customer> rankByTotal() {
            Map<String, Customer> cMap = new LinkedHashMap<>();
            for (Customer c: customers) {
                cMap.put(c.getId(), c);
            }

            List<List<Order>> all = customers.stream().map(c -> c.getOrders()).collect(Collectors.toList());
//            BigDecimal tocustomers.stream().map(c -> c.getOrders()).collect(Collectors.toList());
//                    flatMap(customer -> customer.getOrders().stream()).collect(Collectors.toList());


            Map<String, BigDecimal> m = new LinkedHashMap<>();
            for (Customer c: customers) {
//                BigDecimal total = BigDecimal.ZERO;
//                for (Order o: c.getOrders()) {
//                    total = total.add(o.getTotal());
//                }
                c.setTotal(c.getOrders().stream().map(Order::getTotal).reduce(BigDecimal.ZERO, BigDecimal::add));
//                m.put(c.getId(), total);
            }
//            m.entrySet().stream().sorted((o1, o2) -> o1.getValue().compareTo(o2.getValue()));
            Map<String, BigDecimal> sortedMap = m.entrySet().stream().sorted(Map.Entry.comparingByValue())
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (old, newV)->old, LinkedHashMap::new));
            var l = Arrays.asList("mnm","lklk","asas","bsas");
//            l.sort(String::compareToIgnoreCase);
//            String max = l.stream().max(String::compareToIgnoreCase).get();

            var res = new ArrayList<Customer>();
            for (String id: sortedMap.keySet()) {
                res.add(cMap.get(id));
            }

            Collections.max(l);

            return customers.stream().sorted(Comparator.comparing(Customer::getTotal).reversed()).collect(Collectors.toList());
        }


    }

    private static Order createOrder(String id, float total) {
        return new Order(id, BigDecimal.valueOf(total));
    }

    @Data
    static class Customer {
        private String id;
        private List<Order> orders;
        private BigDecimal total;

        public Customer(String id) {
            this.id = id;
        }

        public void addOrder(Order order) {
            if (orders ==null) {
                orders = new ArrayList<>();
            }
            orders.add(order);
        }
    }

    @Data
    static class Order {
        private String id;
        private BigDecimal total;

        public Order(String id, BigDecimal total) {
            this.id = id;
            this.total = total;
        }
    }
}
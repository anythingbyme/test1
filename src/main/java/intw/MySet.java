package intw;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class MySet {

    private Set<Emp> empSet = new HashSet<>();

    public void add(Emp e) {
        boolean b  = empSet.add(e);
        System.out.println(e.getName()+e.getId() + (b ?  " added" : " failed"));
    }

    @Data
    static class Emp {
        private String id;
        private String name;

        public Emp(String id, String name) {
            this.id = id;
            this.name = name;
        }


    }
}


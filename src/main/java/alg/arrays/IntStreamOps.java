package alg.arrays;

import java.util.Arrays;
import java.util.List;

public class IntStreamOps {
    public static void main(String[] args) {
        //flatMap arrays
        String[][] str = {{"abc","def"}};
        Arrays.stream(str).flatMap(arr-> Arrays.stream(arr)).toList().forEach(System.out::println);

        //flatMap List
        List<List<String>> l = List.of(List.of("xyz", "123"));
        l.stream().flatMap(f->f.stream()).toList().forEach(System.out::println);

        //distinct
        int[] p = {2,2,3,3,4,4,4};
        Arrays.stream(p).distinct().forEach(System.out::println);
    }
}

package alg.arrays;

import java.util.ArrayList;
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


        int[] a = {1,1,1,1};
        List<Integer> list = Arrays.stream(a).boxed().toList();
        String[][] s = {{"hello","world"}};
        Arrays.stream(s).flatMap(Arrays::stream).forEach(System.out::println);

        //reduce
        System.out.println(Arrays.stream(a).reduce(0, Integer::sum));

        //map
        Arrays.stream(a).map(aa->aa+aa).forEach(System.out::println);

        //Integer[] to int[]
        List<Integer> ll = List.of(1,3,5);
        int[] res = ll.stream().mapToInt(Integer::intValue).toArray();

        a = new int[]{1,3,5};
        List<List<Integer>> subLists = new ArrayList<>();
        for (int i=0;i<a.length;i++) {
            add(subLists, List.of(a[i]));
            for (int j=i+1;j<a.length;j++) {
                add(subLists, List.of(a[i], a[j]));
            }
        }

        System.out.println(subLists.size());
    }

    public static void add(List<List<Integer>> subLists, List<Integer> list) {
        subLists.add(list);
    }
}

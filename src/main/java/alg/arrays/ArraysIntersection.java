package alg.arrays;

import java.util.*;

public class ArraysIntersection {

    public int[] find(int[] a, int[] b) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>(Arrays.stream(a).boxed().toList());
//        for (int a1: a) {
//            set.add(a1);
//        }

        for (int b1: b) {
            if (set.contains(b1)) {
                res.add(b1);
            }
        }
        return res.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}

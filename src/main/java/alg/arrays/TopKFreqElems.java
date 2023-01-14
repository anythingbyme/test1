package alg.arrays;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TopKFreqElems {

    public int[] find(int[] nums, int k) {
        Map<Integer, Integer> m = new LinkedHashMap<>();
        for (int n: nums) {
            if (m.containsKey(n)) {
                m.put(n, m.get(n)+1);
            }
            else {
                m.put(n, 1);
            }
        }

        // sort by values
        Map<Integer, Integer> sorted = m.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(k)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (old, newVal)->old, LinkedHashMap::new));
        System.out.println(sorted.size());
        int[] res = new int[k];

        int i =0;
        for (Map.Entry<Integer, Integer> entry: sorted.entrySet()) {
            res[i++] = entry.getKey();
        }
        return res;
    }
}

package alg.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSum {
    public int[] findIndices(int[] nums, int target) {
        Map<Integer, Integer> m = new LinkedHashMap<>();
        for (int i=0;i<nums.length;i++) {
            int num = Math.abs(nums[i]-target);
            if (m.containsKey(num)) {
                return new int[]{m.get(num), i};
            }
            m.put(nums[i], i);
        }
        return null;
    }

}

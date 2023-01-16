package alg.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LongestConsecutiveSeq {
    public int longestConsecutive(int[] nums) {
        /*
            sort
            if consecutive numbers,
         */
        Map<Integer, Integer> m = new HashMap<>();
        for (int n: nums) {
            m.put(n, n);
        }

        return find(nums, m);

    }

    private int find(int[] nums, Map<Integer, Integer> m) {
        int max = 0;
        for (int n: nums) {
            // check contains n--, go right
            int rightMax = 0;
            int right = n;
            while (m.containsKey(right++)) {
                rightMax ++;
            }
            // go left
            int leftMax = 0;
            int left = n;
            while (m.containsKey(left--)) {
                leftMax ++;
//                left = n;
            }
            int elemMax = Math.max(rightMax, leftMax);
            max = Math.max(max, elemMax);
        }
        return max;
    }

    private int findRightMax(int n, Map<Integer, Integer> m) {
        int rightMax = 0;
        int right = n;
        while (m.containsKey(right++)) {
            rightMax ++;
        }
        return rightMax;
    }

    private int findLeftMax(int n, Map<Integer, Integer> m) {
        int leftMax = 0;
        int left = n;
        while (m.containsKey(left--)) {
            leftMax ++;
            left = n;
        }
        return leftMax;
    }
}

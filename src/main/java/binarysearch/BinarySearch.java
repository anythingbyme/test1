package binarysearch;

import java.util.Arrays;

public class BinarySearch {

    public int search(int[] nums, int n) {

        return search(nums, n, 0, nums.length);
    }

    private int search(int[] nums, int n, int begin, int end) {
        int pivot = (begin+end)/2;
        if (nums[pivot] == n) {
            return pivot;
        }
        if (n > nums[pivot]) {
            return search(nums, n, pivot+1, end);
        }
        else {
            return search(nums, n, 0, pivot-1);
        }


    }
}

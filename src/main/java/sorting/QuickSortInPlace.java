package sorting;

public class QuickSortInPlace {

    public void sort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int left = start;
        int right = end-1;
        int pivot = nums[end];
        while (left <= right) {

            // scan left
            while (left <= right && nums[left] < pivot) {
                left++;
            }

            // scan right
            while (left <= right && nums[right] > pivot) {
                right--;
            }

            if (left <= right) {
                //swap
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++ ; right--;
            }
        }

            // now swap the pivot
            int temp = nums[left];
            nums[left] = nums[end];
            nums[end] = temp;

            //recursively divide left side
            sort(nums, start, left-1);
            //recursively divide right side
            sort(nums, left+1, end);


    }
}

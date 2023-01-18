package alg.arrays;

public class ArrayRotater {
    public void rotate(int[] nums) {
        for (int i=0;i<nums.length-1;i++) {
            int temp = nums[0];
            nums[0] = nums[i+1];
            nums[i+1] = temp;
        }
        System.out.println(nums[0]);
    }
}

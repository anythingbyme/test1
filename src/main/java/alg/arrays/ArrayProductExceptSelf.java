package alg.arrays;

public class ArrayProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        // 1 2 3 4
        int[] res = new int[nums.length];
        for (int i = 0;i< nums.length;i++) {
            int r =1 ;
            for (int j = 0; j< nums.length; j++) {
                if (i!=j) {
                    r *= nums[j];
                }


            }
            res[i] = r;
        }

        return res;
    }
}

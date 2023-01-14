package alg.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayProductExceptSelfTest {

    private ArrayProductExceptSelf ap = new ArrayProductExceptSelf();
    @Test
    void productExceptSelf() {
//        Input: nums = [1,2,3,4]
//        Output: [24,12,8,6]
        int[] nums = {1,2,3,4};
        int[] res = ap.productExceptSelf(nums);
        Assertions.assertEquals(24, res[0]);
        Assertions.assertEquals(12, res[1]);
        Assertions.assertEquals(8, res[2]);
        Assertions.assertEquals(6, res[3]);
    }
}
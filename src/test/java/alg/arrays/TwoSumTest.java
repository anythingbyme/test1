package alg.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private TwoSum twoSum = new TwoSum();

    @Test
    void twoSumTest() {
        int[] a = {2,4,8,7,3};
        int[] res = twoSum.findIndices(a, 9);
        Assertions.assertEquals(0, res[0]);
        Assertions.assertEquals(3, res[1]);
    }
    @Test
    void twoSumTest1() {
        int[] a = {3,3};
        int[] res = twoSum.findIndices(a, 6);
        Assertions.assertEquals(0, res[0]);
        Assertions.assertEquals(1, res[1]);
    }

    @Test
    void twoSumTest2() {
        int[] a = {3,2,4};
        int[] res = twoSum.findIndices(a, 6);
        Assertions.assertEquals(1, res[0]);
        Assertions.assertEquals(2, res[1]);
    }    @Test
    void twoSumTest3() {
        int[] a = {3,3};
        int[] res = twoSum.findIndices(a, 6);
        Assertions.assertEquals(0, res[0]);
        Assertions.assertEquals(1, res[1]);
    }
}
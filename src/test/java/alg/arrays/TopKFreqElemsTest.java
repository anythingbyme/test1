package alg.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopKFreqElemsTest {

    private TopKFreqElems topK = new TopKFreqElems();

    @Test
    void find() {
        int[] nums = {2,1,1,2,1,3};
        int k = 2;
        int[] res = topK.find(nums, k);
        Assertions.assertEquals(2,res.length);
        Assertions.assertEquals(1,res[0]);
        Assertions.assertEquals(2,res[1]);
    }

    @Test
    void find2() {
        int[] nums = {2,1,1,2,1,3};
        int k = 1;
        int[] res = topK.find(nums, k);
        Assertions.assertEquals(2,res.length);
        Assertions.assertEquals(1,res[0]);
    }

    @Test
    void find3() {
        int[] nums = {2,1,1,2,1,3};
        int k = 3;
        int[] res = topK.find(nums, k);
        Assertions.assertEquals(2,res.length);
        Assertions.assertEquals(1,res[0]);
        Assertions.assertEquals(2,res[1]);
        Assertions.assertEquals(3,res[2]);
    }
}
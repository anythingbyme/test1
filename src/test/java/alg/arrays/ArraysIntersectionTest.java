package alg.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArraysIntersectionTest {

    private ArraysIntersection ai = new ArraysIntersection();
    @Test
    void find() {
        int[] a = {2,1,5,8};
        int[] b = {5,1,7};

        int[] res = {5,1};
        Arrays.sort(res);
        Assertions.assertTrue(Arrays.equals(res, ai.find(a,b)));

    }
}
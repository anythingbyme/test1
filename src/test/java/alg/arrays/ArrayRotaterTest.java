package alg.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayRotaterTest {

    private ArrayRotater ar = new ArrayRotater();

    @Test
    void rotate() {
        int[] a = {1,2,3,4,5};
        ar.rotate(a);
        Assertions.assertEquals(5,a[0]);
        Assertions.assertEquals(1,a[1]);
        Assertions.assertEquals(2,a[2]);
        Assertions.assertEquals(3,a[3]);
        Assertions.assertEquals(4,a[4]);
    }

    @Test
    void rotate2() {
        int[] a = {-5,7,3,2,5};
        ar.rotate(a);
        Assertions.assertEquals(5,a[0]);
        Assertions.assertEquals(-5,a[1]);
        Assertions.assertEquals(7,a[2]);
        Assertions.assertEquals(3,a[3]);
        Assertions.assertEquals(2,a[4]);
    }
}
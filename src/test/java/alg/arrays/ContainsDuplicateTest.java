package alg.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    private ContainsDuplicate containsDuplicate = new ContainsDuplicate();
    @Test
    void check1() {
        int[] a = {3,1,2,1,2};
        Assertions.assertEquals(true, containsDuplicate.check(a));
    }
    @Test
    void check2() {
        int[] a = {3,8,22,11,32};
        Assertions.assertEquals(false, containsDuplicate.check(a));
    }
}
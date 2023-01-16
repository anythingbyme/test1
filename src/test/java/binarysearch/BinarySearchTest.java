package binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {


    private BinarySearch bs = new BinarySearch();

    @Test
    void search1() {
        int[] nums = {12, 18, 21, 35, 37, 66};
        Assertions.assertEquals(4, bs.search(nums, 37));
    }
    @Test
    void search2() {
        int[] nums = {12, 18, 21, 35, 37, 66};
        Assertions.assertEquals(5, bs.search(nums, 66));
    }
    @Test
    void search3() {
        int[] nums = {12, 18, 21, 35, 37, 66};
        Assertions.assertEquals(1, bs.search(nums, 18));
    }

@Test
    void search4() {
        int[] nums = {12, 18, 21, 35, 37, 66};
        Assertions.assertEquals(2, bs.search(nums, 21));
    }


}
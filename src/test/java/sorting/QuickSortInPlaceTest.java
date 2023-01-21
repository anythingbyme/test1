package sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortInPlaceTest {

    private QuickSortInPlace qSortInPlace = new QuickSortInPlace();

    @Test
    void sort() {
        int[] nums = {85,24,73,45,17,31,96,50};
        qSortInPlace.sort(nums, 0, nums.length-1);
        Assertions.assertEquals(17, nums[0]);
        Assertions.assertEquals(24, nums[1]);
        Assertions.assertEquals(31, nums[2]);
        Assertions.assertEquals(45, nums[3]);
        Assertions.assertEquals(50, nums[4]);
        Assertions.assertEquals(73, nums[5]);
        Assertions.assertEquals(85, nums[6]);
        Assertions.assertEquals(96, nums[7]);
    }
}
package alg.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSeqTest {

    private LongestConsecutiveSeq lcs = new LongestConsecutiveSeq();
    @Test
    void longestConsecutive1() {
        /*
        Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
         */
        int[] nums = {100,4,200,1,3,2};
        Assertions.assertEquals(4, lcs.longestConsecutive(nums));
    }

    @Test
    void longestConsecutive2() {
        /*
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
         */
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        Assertions.assertEquals(9, lcs.longestConsecutive(nums));
    }
}
package alg.arrays;

import java.util.Arrays;

public class ContainsDuplicate {

    public boolean check(int[] src) {
        return src.length != Arrays.stream(src).distinct().count();
    }
}

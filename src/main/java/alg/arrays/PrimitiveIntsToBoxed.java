package alg.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimitiveIntsToBoxed {
    public List<Integer> convert(int[] a) {
        return Arrays.stream(a).boxed().collect(Collectors.toList());
    }
}

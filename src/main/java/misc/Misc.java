package misc;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Misc {
    public int rShift() {
        return 0;
    }

    public void filterNames(List<String> names, Predicate<String> predicate) {
        names.stream().filter(predicate).forEach(System.out::println);
    }

    public void trandformNames(List<String> names, Function<String, String> function) {
        names.stream().map(function).forEach(System.out::println);
    }
}

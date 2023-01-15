package alg.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ValidSudokuTest {

    @Test
    void isValidSudoku() {
        Character[][] c = new Character[3][];
        c[0] = new Character[]{'1', '2', '.'};//new char[3];
        c[1] = new Character[]{'1','2','.'};//new char[3];
        c[2] = new Character[]{'1','2','.'};//new char[3];

        int[][] i = new int[2][];
        i[0] = new int[]{1,2,3};
        i[1] = new int[]{4,5,6};

        int[] res =Arrays.stream(i).flatMapToInt(in-> Arrays.stream(in)).toArray();
        for (int r: res) {
//            System.out.println(r);
        }

        int[] s = {1,1};

        List<Integer> integers = Arrays.stream(s).boxed().collect(Collectors.toList());

//        List<char[]> l = Stream.of(c).collect(Collectors.toList());





        List<Character> res1 = Stream.of(c).flatMap(chars -> Stream.of(chars)).collect(Collectors.toList());
        for (Character cr: res1) {
            System.out.print(cr+ " ");
        }
        System.out.println("\n");
        List<Character> ip  = res1.stream().filter(st->st.charValue() != '.').collect(Collectors.toList());
        for (Character p: ip) {
            System.out.print(p+ " ");
        }
    }

    @Test
    void isValidSudoku2() {
        char[][] c = new char[3][];
        c[0] = new char[]{'2', '1','.'};
        c[1] = new char[]{'2', '1','.'};
        c[2] = new char[]{'2', '1','.'};
        Assertions.assertFalse(new ValidSudoku().isValidSudoku(c));
    }

    @Test
    void isValidSudoku3() {
        char[][] c = new char[3][];
        c[0] = new char[]{'2', '1','3'};
        c[1] = new char[]{'.', '5','.'};
        c[2] = new char[]{'.', '.','.'};
        Assertions.assertTrue(new ValidSudoku().isValidSudoku(c));
    }

    @Test
    void isValidSudoku4() {
        char[][] c = new char[4][];
        c[0] = new char[]{'2', '1','3','5', '4','.'};
        c[1] = new char[]{'.', '5','.','.', '6','8'};
        c[2] = new char[]{'1', '4','.','3', '.','.'};
        c[3] = new char[]{'7', '3','.','2', '.','.'};
        Assertions.assertTrue(new ValidSudoku().isValidSudoku(c));
    }
}
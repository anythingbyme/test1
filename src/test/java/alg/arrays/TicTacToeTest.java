package alg.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @Test
    void play() {
        char[][] c = new char[3][];
        c[0] = new char[]{'x','x','x'};
        c[1] = new char[]{'y','y','x'};
        c[2] = new char[]{'x','y','y'};
        Assertions.assertTrue(new TicTacToe().play(c));
    }

    @Test
    void play2() {
        char[][] c = new char[3][];
        c[0] = new char[]{'x','x','y'};
        c[1] = new char[]{'y','y','x'};
        c[2] = new char[]{'x','y','y'};
        Assertions.assertFalse(new TicTacToe().play(c));
    }
}
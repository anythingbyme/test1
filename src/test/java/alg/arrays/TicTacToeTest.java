package alg.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @Test
    void play() {
        char[][] c = new char[3][];
        c[0] = new char[]{'x','x','y'};
        c[1] = new char[]{'y','x','x'};
        c[2] = new char[]{'y','y','x'};
        new TicTacToe().play(c);
    }
}
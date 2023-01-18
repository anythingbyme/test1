package alg.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubsetGeneratorTest {

    private SubsetGenerator sg = new SubsetGenerator();

    @Test
    void generateSubsets1() {
        sg.generateSubsets("abcd");
    }
}
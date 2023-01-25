package intw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MySetTest {

    private MySet mySet = new MySet();

    @Test
    void add() {
        mySet.add(new MySet.Emp("1","Raj"));
        mySet.add(new MySet.Emp("2","Su"));
        mySet.add(new MySet.Emp("1","Raj"));
    }
}
package dp.behavioral.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {

    @Test
    void register() {
        Subject subject = new Subject();
        subject.register(new Observer());
    }

    @Test
    void unregister() {
    }

    @Test
    void notifyObservers() {
    }
}
package dp.behavioral.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {

    Subject subject = new Subject();
    @Test
    void register() {
        subject.register(new Observer());
    }

    @Test
    void unregister() {
    }

    @Test
    void notifyObservers() {
        subject.register(new Observer());
        subject.register(new Observer());
        Observer observer = new Observer();
        subject.register(observer);
        subject.unregister(observer);
        subject.register(new Observer());
        subject.setState("Todays news");
    }
}
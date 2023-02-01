package dp.behavioral.observer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ObserverTest {

    private Observer observer = new Observer();

    @Test
    void update() {
        /**
         *
         */
    }

    @Test
    void getConsumerCount() {
        Subject subject = new Subject();
        subject.setState("lenovo laptop");
        observer.subscribe(subject);

        subject = new Subject();
        subject.setState("macbook laptop");
        observer.subscribe(subject);

        Assertions.assertEquals(2, observer.consumersCount());

        observer.update("Lenovo");

        observer.unsubscribe(subject);

        Assertions.assertEquals(1, observer.consumersCount());

        observer.update("Macbook sale");
    }
}
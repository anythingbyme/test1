package dp.behavioral;

import dp.behavioral.observer.Observer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ObserverTest {

    @Test
    public void register() {
        Observer observer = new Observer();
        Assertions.assertEquals("","");
    }

}
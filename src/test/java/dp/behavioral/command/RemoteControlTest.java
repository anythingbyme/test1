package dp.behavioral.command;

import org.junit.jupiter.api.Test;

class RemoteControlTest {

    private RemoteControl rc = new RemoteControl();
    @Test
    void onButtonPressed() {
        rc.onButtonPressed();
    }

    @Test
    void offButtonPressed() {
        rc.offButtonPressed();
    }





}
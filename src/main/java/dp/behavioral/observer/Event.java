package dp.behavioral.observer;

import lombok.Data;

@Data
public class Event {
    private String value;

    public Event(String value) {
        this.value = value;
    }
}

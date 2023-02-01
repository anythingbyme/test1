package dp.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Observer implements IObserver{
    private String updates;
    private List<Subject> subscribers;

    public Observer() {
        subscribers = new ArrayList<>();
    }

    @Override
    public void update(String updates) {
        System.out.println("New update received:" + updates);
        notifySubscribers(new Event(updates));
    }


    public int consumersCount(){
        return subscribers.size();
    }

    public void notifySubscribers(Event event) {
        subscribers.stream()
//                .filter(e->e.getState().contains(event.getValue()))
                .forEach(a-> a.notificationReceived());
    }

    @Override
    public void subscribe(Subject subject) {
        subscribers.add(subject);
    }

    @Override
    public void unsubscribe(Subject subject) {
        subscribers.remove(subject);

    }
}

package dp.behavioral.observer;

import java.util.ArrayList;
import java.util.List;


/**
 * Subject mnages data
 * Data in the subject chnges, observers are notified
 * Observer pattern defines one-many dep btw objects, when one object state chanhes, all deps are updated
 *
 * strive for loose coupling btw objects that interact
 *
 */
public class Subject implements ISubject{
    List<IObserver> observers = new ArrayList<>();
    private String state;

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(iObserver -> {
            iObserver.update(state);

        });
    }

    public void setState(String newData) {
        this.state = newData;
        notifyObservers();
    }

}

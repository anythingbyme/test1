package dp.behavioral.observer;

public interface ISubject {
    void register(Observer observer);
    void unregister(Observer observer);

    void notificationReceived();
    void notifyObservers();
}

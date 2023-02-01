package dp.behavioral.observer;

public interface IObserver {
    void update(String updates);

    void subscribe(Subject subject);
    void unsubscribe(Subject subject);
}

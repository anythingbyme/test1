package dp.behavioral.observer;

public class Observer implements IObserver{
    private String updates;

    @Override
    public void update(String updates) {
        System.out.println("New update received:" + updates);
    }
}

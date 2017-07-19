package event_bus.push_event_bus;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class EventBus implements Runnable {

    private List<Observer> observers = new ArrayList<>();
    private Queue<Event> events = new LinkedList<>();
    private volatile boolean finished = false;

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public int getObserversCount() {
        return observers.size();
    }

    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    public void unregisterAllObservers() {
        observers.clear();
    }

    private void pushEventsToObservers() {
        if (!events.isEmpty()) {
            for (Observer observer : observers) {
                observer.update(events.poll());
            }
        }
    }

    void submit(Event event) {
        events.offer(event);
    }

    public void finish() {
        finished = true;
    }

    @Override
    public void run() {
        while (!finished) {
            pushEventsToObservers();
        }
    }

}

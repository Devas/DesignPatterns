package observer.own_1;

import java.util.ArrayList;
import java.util.List;

public class Observable {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public int getObserversCount() {
        return observers.size();
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void removeAllObservers() {
        observers.clear();
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(this, null);
        }
    }

    public void notifyAllObservers(Object arg) {
        for (Observer observer : observers) {
            observer.update(this, arg);
        }
    }

}

package observer.java_util_based_3_wrapping;

import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

/**
 * Subject / Observable.
 * Here is EventSource.
 */
public class Subject extends Observable implements Runnable {

    public void run() {
        while (true) {
            String response = new Scanner(System.in).next();
            setChanged();
            notifyObservers(response);
        }
    }

    // wrapping methods
    public void addObserver(Observer observer) {
        super.addObserver(observer);
    }

    public int getObserversCount() {
        return countObservers();
    }

    public void removeObserver(Observer observer) {
        deleteObserver(observer);
    }

    public void notifyAllObservers() {
        notifyObservers();
    }

    public void notifyAllObservers(Object arg) {
        notifyObservers(arg);
    }

}
package observer.java_util_based_1;

import java.util.Observable;
import java.util.Scanner;

/**
 * Subject / Observable.
 */
class EventSource extends Observable implements Runnable {

    public void run() {
        while (true) {
            String response = new Scanner(System.in).next();
            setChanged();
            notifyObservers(response);
        }
    }

}
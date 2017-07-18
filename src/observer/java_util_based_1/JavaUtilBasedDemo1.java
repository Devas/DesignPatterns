package observer.java_util_based_1;

import java.util.Observable;
import java.util.Observer;

/**
 * When a string is supplied from System.in, the method notifyObservers is then called, in order to notify
 * all observers of the event's occurrence, in the form of an invocation of their 'update' methods.
 */
public class JavaUtilBasedDemo1 {

    public static void main(String[] args) {
        System.out.println("Enter Text: ");
        EventSource eventSource = new EventSource();

        eventSource.addObserver(new Observer() {
            public void update(Observable observable, Object arg) {
                System.out.println("Received response: " + arg);
            }
        });

        new Thread(eventSource).start();
    }

}
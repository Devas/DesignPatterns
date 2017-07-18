package observer.java_util_based_3_wrapping;

import java.util.Observable;
import java.util.Observer;

/**
 * When a string is supplied from System.in, the method notifyObservers is then called, in order to notify
 * all observers of the event's occurrence, in the form of an invocation of their 'update' methods.
 */
public class JavaUtilBasedDemo3 {

    public static void main(String[] args) {
        System.out.println("Enter Text: ");
        Subject subject = new Subject();

        //->
        Observer observer1 = new Observer() {
            @Override
            public void update(Observable observable, Object arg) {
                System.out.println("Observer 1 received response: " + arg);
            }
        };
        subject.addObserver(observer1);

        //->
        Observer observer2 = (observable, arg) -> System.out.println("Observer 2 received response: " + arg);
        subject.addObserver(observer2);

        //->
        subject.addObserver(new Observer() {
            @Override
            public void update(Observable observable, Object arg) {
                System.out.println("Observer 3 received response: " + arg);
            }
        });

        //->
        subject.addObserver((observable, arg) -> System.out.println("Observer 4 received response: " + arg));

        new Thread(subject).start();
    }

}
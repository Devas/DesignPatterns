package observer.own_1;

/**
 * The observer pattern is a software design pattern in which an object, called the subject,
 * maintains a list of its dependents, called observers, and notifies them automatically of any state changes,
 * usually by calling one of their methods.
 * <p>
 * https://en.wikipedia.org/wiki/Lapsed_listener_problem
 */
public class OwnObserverDemo1 {

    public static void main(String[] args) {
        Observable observable = new MyObservable();
        observable.addObserver((o, arg) -> System.out.println("Observer 1 notified"));
        observable.addObserver((o, arg) -> System.out.println("Observer 2 notified"));
        System.out.println("Observers count: " + observable.getObserversCount());
        observable.notifyAllObservers();
    }

}

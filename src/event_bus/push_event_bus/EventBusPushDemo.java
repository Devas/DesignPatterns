package event_bus.push_event_bus;

/**
 * The observer pattern is a software design pattern in which an object, called the subject,
 * maintains a list of its dependents, called observers, and notifies them automatically of any state changes,
 * usually by calling one of their methods.
 * <p>
 * https://en.wikipedia.org/wiki/Lapsed_listener_problem
 * <p>
 * There are several types of communication that may occur on the Event Bus:
 * <ul>
 * <li>Publish-Subscribe: Modules may subscribe to certain message types. Whenever a module publishes a message to the bus,
 * it will be delivered to all modules that subscribed to its message type.
 * <li>Broadcast: The message will be delivered to all (other) modules.
 * <li>Point-to-point: The message has one and only one recipient.
 * </ul>
 * </p>
 */
public class EventBusPushDemo {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        Observable observable = new MyObservable(eventBus);

        observable.submitEventToBus(new Event<>("message 1"));
        observable.submitEventToBus(new Event<>("message 2"));
        observable.submitEventToBus(new Event<>(3));
        observable.submitEventToBus(new Event<>("message 4"));
        observable.submitEventToBus(new Event<>(5.0));

        eventBus.registerObserver(new Observer() {
            @Override
            public void update(Event<?> event) {
                System.out.println("Observer 1 notified with Event: " + event);
            }

            public void onEvent(Event<Integer> event) {
                System.out.println("Integer: " + event.getEventObject());
            }
        });
        eventBus.registerObserver(new Observer() {
            @Override
            public void update(Event<?> event) {
                System.out.println("Observer 2 notified with Event: " + event);
            }
        });
        new Thread(eventBus).start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        eventBus.finish();
        eventBus.unregisterAllObservers();
    }

}

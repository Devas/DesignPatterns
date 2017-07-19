package event_bus.push_event_bus;

public final class Event<T> {

    private final T eventObject;

    public Event(T eventObject) {
        this.eventObject = eventObject;
    }

    public T getEventObject() {
        return eventObject;
    }

    @Override
    public String toString() {
        return eventObject.toString();
    }

}

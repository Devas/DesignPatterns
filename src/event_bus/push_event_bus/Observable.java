package event_bus.push_event_bus;

public abstract class Observable {

    private EventBus eventBus;

    public Observable(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public void submitEventToBus(Event event) {
        eventBus.submit(event);
    }

}

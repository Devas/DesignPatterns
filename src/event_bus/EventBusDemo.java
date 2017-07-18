package event_bus;

/**
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
public class EventBusDemo {


}

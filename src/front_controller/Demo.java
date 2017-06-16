package front_controller;

/**
 * The front controller design pattern is used to provide a centralized request handling mechanism so that all requests
 * will be handled by a single handler.
 * This handler can do the authentication / authorization / logging or tracking of request and then pass the requests
 * to corresponding handlers. Following are the entities of this type of design pattern.
 * <p>
 * Front Controller - Single handler for all kinds of requests coming to the application (web based or desktop based).
 * <p>
 * Dispatcher - Front Controller may use a dispatcher object which can dispatch the request to corresponding specific handler.
 * <p>
 * View - Views are the object for which the requests are made.
 */
public class Demo {

    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("home");
        frontController.dispatchRequest("student");
    }

}
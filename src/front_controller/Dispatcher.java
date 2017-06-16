package front_controller;

public class Dispatcher {

    private StudentView studentView;
    private HomeView homeView;

    public Dispatcher() {
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("student")) {
            studentView.show();
        } else if (request.equalsIgnoreCase("home")) {
            homeView.show();
        } else {
            System.out.println("Nothing to dispatch");
        }
    }

}
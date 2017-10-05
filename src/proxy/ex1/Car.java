package proxy.ex1;

// Real Object
public class Car implements ICar {

    @Override
    public void driveCar() {
        System.out.println("Car has been driven!");
    }
}

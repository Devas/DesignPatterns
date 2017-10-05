package proxy.ex1;

//Proxy Object
public class ProxyCar implements ICar {

    private Driver driver;
    private ICar realCar;

    public ProxyCar(Driver driver) {
        this.driver = driver;
        this.realCar = new Car();
    }

    @Override
    public void driveCar() {
        if (driver.getAge() <= 16) {
            System.out.println("Sorry, the driver is too young to drive.");
        } else {
            realCar.driveCar();
        }
    }
}

package proxy.ex1;

public class ProxyDemo1 {

    public static void main(String[] args) {
        ICar car = new ProxyCar(new Driver(16));
        car.driveCar();

        car = new ProxyCar(new Driver(25));
        car.driveCar();
    }
}

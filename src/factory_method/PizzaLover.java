package factory_method;

abstract class Pizza {
    public abstract double getPrice();
}

class HamAndMushroomPizza extends Pizza {
    private double price = 8.5;

    public double getPrice() {
        return price;
    }
}

class DeluxePizza extends Pizza {
    private double price = 10.5;

    public double getPrice() {
        return price;
    }
}

class HawaiianPizza extends Pizza {
    private double price = 11.5;

    public double getPrice() {
        return price;
    }
}

class PizzaFactory {

    public enum PizzaType {
        HamMushroom,
        Deluxe,
        Hawaiian
    }

    public static Pizza createPizza(PizzaType pizzaType) {
        switch (pizzaType) {
            case HamMushroom:
                return new HamAndMushroomPizza();
            case Deluxe:
                return new DeluxePizza();
            case Hawaiian:
                return new HawaiianPizza();
        }
        throw new IllegalArgumentException("The pizza type " + pizzaType + " is not recognized.");
    }
}

public class PizzaLover {
    /**
     * Create all available pizzas and print their prices
     */
    public static void main(String args[]) {
        for (PizzaFactory.PizzaType pizzaType : PizzaFactory.PizzaType.values()) {
            System.out.println("Price of " + pizzaType + " is " + PizzaFactory.createPizza(pizzaType).getPrice());
        }
    }
}
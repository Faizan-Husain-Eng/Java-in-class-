

class Car {
    String brand;

    Car(String b) {   // Constructor
        brand = b;
    }

    void show() {
        System.out.println("Car Brand: " + brand);
    }
}

public class Constraction {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota");
        c1.show();
    }
}
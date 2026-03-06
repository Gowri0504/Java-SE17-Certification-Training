package record;
sealed class Vehicle permits Car, Bike, Truck {
}

final class Car extends Vehicle {
}

final class Bike extends Vehicle {
}

non-sealed class Truck extends Vehicle {
}

class MiniTruck extends Truck {
}

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        Truck t1 = new Truck();
        MiniTruck t2 = new MiniTruck();

        System.out.println("Truck can be inherited because it is non-sealed.");
    }
}
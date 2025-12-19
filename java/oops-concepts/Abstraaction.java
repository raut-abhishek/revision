// Abstraction in Java


abstract class Vehicle {

    abstract void start();   

    void fuel() {           
        System.out.println("low fuel");
    }
}

class Bike extends Vehicle {

    void start() {
        System.out.println("Ignition");
    }
}


public class Abstraaction {
    public static void main(String[] args) {
        Vehicle obj = new Bike();
        obj.start();
        obj.fuel();
    }
}

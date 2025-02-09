public class Main{
    public static void main(String[] args) {
        //  Abstract : abstract classes can't be instantiated, but they can hav subclass
        //abstract methods are declared without an implementation

        Car car = new Car();
        //  We can't create a vehicle class due to abstract keyword
        car.go();
    }
}

class Car extends Vehicle{
    @Override
    void go()
    {System.out.println("Car drives!");}
}

abstract class Vehicle{
    abstract void go();
}
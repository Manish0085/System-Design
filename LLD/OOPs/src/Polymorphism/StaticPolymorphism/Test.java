package Polymorphism.StaticPolymorphism;

public class Test {


    public static void main(String[] args) {
        ManualCar car1 = new ManualCar("Suzuki", "WagnoR");
        car1.startEngine();
        car1.shiftGear(1);
        car1.accelerate();
        car1.shiftGear(2);
        car1.accelerate();
        car1.shiftGear(3);
        car1.accelerate();
        car1.accelerate(40);
        car1.brake();
        car1.stopEngine();
    }
}

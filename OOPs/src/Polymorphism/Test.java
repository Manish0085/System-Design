package Polymorphism;

import Inheritence.ElectricCar;
import Inheritence.ManualCar;

public class Test {

    public static void main(String[] args) {
        ManualCar car1 = new ManualCar("Maruti Suzuki", "Ciaz");
        car1.startEngine();
        car1.shiftGear(1);
        car1.accelerate();
        car1.shiftGear(2);
        car1.accelerate();
        car1.shiftGear(3);
        car1.accelerate();
        car1.breakCar();
        car1.breakCar();
        car1.stopEngine();


        System.out.println("\n\n\n************************************");
        ElectricCar car2 = new ElectricCar("TATA", "Curve");
        car2.startEngine();
        car2.accelerate();
        car2.accelerate();
        car2.accelerate();
        car2.breakCar();
        car2.breakCar();
        car2.stopEngine();
    }
}

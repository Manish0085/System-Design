package Inheritence;

public class Test {

    public static void main(String[] args) {
        ManualCar car1 = new ManualCar("Honda", "Amaze");
        ElectricCar car2 = new ElectricCar("TATA", "Curve");

        car1.startEngine();
        car1.shiftGear(1);
        car1.accelerate();
        car1.shiftGear(2);
        car1.accelerate();
        car1.shiftGear(3);
        car1.accelerate();
        car1.shiftGear(4);
        car1.accelerate();
        car1.accelerate();
        car1.breakCar();
        car1.breakCar();
        car1.stopEngine();
        car1.accelerate();

        System.out.println("\n\n\n********************************************");
        car2.startEngine();
        car2.accelerate();
        car2.accelerate();
        car2.breakCar();
        car2.accelerate();
        car2.accelerate();
        car2.accelerate();
        car2.drive(50);
        car2.breakCar();
        car2.breakCar();
        car2.stopEngine();

    }
}

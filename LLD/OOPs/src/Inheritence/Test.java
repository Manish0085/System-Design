package Inheritence;

public class Test {

    public static void main(String[] args) {
        ManualCar manualCar = new ManualCar("Suzuki", "WagonR");
        manualCar.startEngine();
        manualCar.shiftGear(1);
        manualCar.accelerate();
        manualCar.shiftGear(2);
        manualCar.accelerate();
        manualCar.brake();
        manualCar.stopEngine();

        System.out.println("---------------------------------------------------");
        ElectricCar electricCar = new ElectricCar("Tesla", "Model 5");
        electricCar.chargeBattery();
        electricCar.startEngine();
        electricCar.accelerate();
        electricCar.accelerate();
        electricCar.brake();
        electricCar.stopEngine();


    }
}

package SingleOOPsExample;

public class Test {
    public static void main(String[] args) {
        ManualCar car1 = new ManualCar("Tata", "Safari");

        car1.startEngine();
        car1.shiftGear(1);
        car1.accelerate();
        car1.shiftGear(2);
        car1.accelerate();
        car1.shiftGear(2);
        car1.accelerate();
        car1.shiftGear(2);
        car1.accelerate();
        car1.accelerate();
        car1.breakCar();
        car1.breakCar();
        car1.shiftGear(2);
        car1.stopEngine();
    }
}

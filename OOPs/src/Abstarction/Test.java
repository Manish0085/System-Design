package Abstarction;

public class Test {


    public static void main(String[] args) {
        Car car = new Sedan("Volvo Voswangan", "Vertus GT");
        car.startEngine();
        car.shiftGear(1);
        car.accelerate();
        car.shiftGear(2);
        car.accelerate();
        car.shiftGear(3);
        car.accelerate();
        car.shiftGear(4);
        car.accelerate();
        car.accelerate();
        car.breakCar();
        car.breakCar();
        car.stopEngine();
        car.accelerate();

    }
}

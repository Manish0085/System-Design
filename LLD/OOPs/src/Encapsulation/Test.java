package Encapsulation;

public class Test {

    public static void main(String[] args) {
        SportCar car1 = new SportCar("Ford", "Mustang");
        car1.startEngine();
        car1.shiftGear(1);
        car1.accelerate();
        car1.shiftGear(2);
        car1.accelerate();
        car1.shiftGear(3);
        car1.accelerate();
        car1.brake();
        car1.accelerate();
        car1.shiftGear(4);
        car1.accelerate();
        // car1.currentSpeed = 300;
        System.out.println("Current speed of car is "+car1.getCurrentSpeed());
        car1.accelerate();
        car1.brake();
        car1.brake();
        car1.stopEngine();

//        car1.currentSpeed = 300;



    }
}

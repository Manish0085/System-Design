package Encapsulation;



public class Test {


    public static void main(String[] args) {
        Car1 car = new Car1("Skoda", "Slavia");
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

        //setting arbitrary value to speed which is wrong
        car.currentSpeed = 250;
        System.out.println("Current speed of suv car is "+ car.currentSpeed);


        System.out.println("\n\n\n********************************************");

        Car2 vehicle = new Car2("TATA", "Safari");
        vehicle.startEngine();
        vehicle.shiftGear(1);
        vehicle.accelerate();
        vehicle.shiftGear(2);
        vehicle.accelerate();
        vehicle.shiftGear(3);
        vehicle.accelerate();
        vehicle.shiftGear(4);
        vehicle.accelerate();
        vehicle.accelerate();
        vehicle.breakCar();
        vehicle.breakCar();
        vehicle.stopEngine();
        vehicle.accelerate();

        //setting arbitrary value to speed which is wrong
//        vehicle.currentSpeed = 250;
//        System.out.println("Current speed of suv car is "+ vehicle.currentSpeed);


    }
}

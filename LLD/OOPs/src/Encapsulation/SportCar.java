package Encapsulation;

public class SportCar {

    private String brand;
    private String model;
    private boolean isEngineOn;
    private int currentSpeed;
    private int currentGear;

    public int getCurrentSpeed( ){
        return this.currentSpeed;
    }

    public SportCar(String brand, String model){
        this.brand = brand;
        this.model = model;
        this.isEngineOn = false;
        this.currentSpeed = 0;
        this.currentGear = 0;
    }

    public void startEngine() {
        this.isEngineOn = true;
        System.out.println(brand + " " + model+ ": Engine starts with a roar!");
    }

    public void shiftGear(int gear) {
        if(!isEngineOn){
            System.out.println(brand + " " + model+ ": Engine is off!!! Cannot shift Gear.");
            return;
        }
        currentGear = gear;
        System.out.println(brand + " " + model+ ": Shifted to gear "+ currentGear);
    }

    public void accelerate() {
        if(!isEngineOn){
            System.out.println(brand + " " + model+ ": Engine is off!!! Cannot accelerate.");
            return;
        }
        currentSpeed += 20;
        System.out.println(brand + " " + model+ ": Engine accelerated to speed "+currentSpeed+" km/h");
    }

    public void brake() {
        if(!isEngineOn){
            System.out.println(brand + " " + model+ ": Engine is already off!!!");
            return;
        }
        currentSpeed -= 20;
        System.out.println(brand + " " + model+ ": Breaking! Speed is now "+currentSpeed+" km/h");

    }

    public void stopEngine() {
        if(!isEngineOn){
            System.out.println(brand + " " + model+ ": Engine is already off!!!");
            return;
        }
        currentGear = 0;
        currentSpeed = 0;
        isEngineOn = false;
        System.out.println(brand + " " + model+ ": Engine is turned off!!!");
    }
}

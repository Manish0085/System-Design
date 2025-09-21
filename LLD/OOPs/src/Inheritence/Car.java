package Inheritence;

public class Car {

    protected String brand;
    protected  String model;
    protected  boolean isEngineOn;
    protected int currentSpeed;


    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
        this.isEngineOn = false;
        this.currentSpeed = 0;
    }

    public void startEngine(){
        this.isEngineOn = true;
        System.out.println(brand+" "+model+": Engine started");
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
        currentSpeed = 0;
        isEngineOn = false;
        System.out.println(brand + " " + model+ ": Engine is turned off!!!");
    }
}

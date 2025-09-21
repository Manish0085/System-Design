package Polymorphism;

public abstract class Car {

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


    public void stopEngine() {
        if(!isEngineOn){
            System.out.println(brand + " " + model+ ": Engine is already off!!!");
            return;
        }
        currentSpeed = 0;
        isEngineOn = false;
        System.out.println(brand + " " + model+ ": Engine is turned off!!!");
    }

    public abstract void accelerate();
    public abstract void brake();
}

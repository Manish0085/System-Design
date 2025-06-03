package Inheritence;

public class Car {

    protected String brand;
    protected String model;
    protected int currentSpeed;
    protected boolean isEngineOn;


    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
        this.currentSpeed = 0;
        this.isEngineOn = false;
    }



    public void startEngine(){
        isEngineOn = true;
        System.out.println(brand+" "+model+": Engine Started");
    }

    public void accelerate() {
        if (!isEngineOn){
            System.out.println(brand+" "+model+": Engine is off. Can not accelerate the car");
            return;
        }
        currentSpeed += 20;
        System.out.println(brand+" "+model+": car accelerated to "+currentSpeed);
    }

    public void breakCar() {
        if (!isEngineOn){
            System.out.println(brand+" "+model+": Engine is off. Can not break the car");
            return;
        }
        currentSpeed -= 20;
        System.out.println(brand+" "+model+": Break car to speed "+currentSpeed);
    }

    public void stopEngine() {
        if (!isEngineOn){
            System.out.println(brand+" "+model+": Engine is already off.");
            return;
        }
        isEngineOn = false;
        currentSpeed = 0;
        System.out.println(brand+" "+model+": Engine stopped");
    }
}

package Abstarction;

public class Sedan implements Car{

    String brand;
    String model;
    boolean isEngineOn;
    int currentSpeed;
    int currentGear;

    public Sedan(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.isEngineOn = false;
        this.currentSpeed = 0;
        this. currentGear = 0;
    }

    @Override
    public void startEngine() {
        isEngineOn = true;
        System.out.println(brand+" "+model+": Engine Started");
    }

    @Override
    public void shiftGear(int gear) {
        if (!isEngineOn){
            System.out.println(brand+" "+model+": Engine is off. Can not shift the gear");
            return;
        }
        currentGear = gear;
        System.out.println(brand+" "+model+": Gear shifted to "+gear);
    }

    @Override
    public void accelerate() {
        if (!isEngineOn){
            System.out.println(brand+" "+model+": Engine is off. Can not accelerate the car");
            return;
        }
        currentSpeed += 20;
        System.out.println(brand+" "+model+": car accelerated to "+currentSpeed);
    }

    @Override
    public void breakCar() {
        if (!isEngineOn){
            System.out.println(brand+" "+model+": Engine is off. Can not break the car");
            return;
        }
        currentSpeed -= 20;
        System.out.println(brand+" "+model+": Break car to speed "+currentSpeed);
    }

    @Override
    public void stopEngine() {
        if (!isEngineOn){
            System.out.println(brand+" "+model+": Engine is already off.");
            return;
        }
        isEngineOn = false;
        currentGear = 0;
        currentSpeed = 0;
        System.out.println(brand+" "+model+": Engine stopped");
    }
}

package Encapsulation;

public class Car2 {

    private String brand;
    private String model;
    private boolean isEngineOn;
    private int currentSpeed;
    private int currentGear;

    public Car2(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.isEngineOn = false;
        this.currentSpeed = 0;
        this. currentGear = 0;
    }

    public int getCurrentSpeed(){
        return currentSpeed;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public int getCurrentGear(){
        return currentGear;
    }


    public void startEngine() {
        isEngineOn = true;
        System.out.println(brand+" "+model+": Engine Started");
    }

    public void shiftGear(int gear) {
        if (!isEngineOn){
            System.out.println(brand+" "+model+": Engine is off. Can not shift the gear");
            return;
        }
        currentGear = gear;
        System.out.println(brand+" "+model+": Gear shifted to "+gear);
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
        currentGear = 0;
        currentSpeed = 0;
        System.out.println(brand+" "+model+": Engine stopped");
    }



}

package Polymorphism.StaticPolymorphism;

public class ManualCar {

    private String brand;
    private String model;
    private int currentSpeed;
    private int currentGear;
    private boolean isEngineOn;

    public void startEngine(){
        if (!isEngineOn){
            isEngineOn = true;
            System.out.println(brand+" "+model+": Engine started");
            return;
        }
        System.out.println(brand+" "+model+": Engine is already started");
    }

    public void shiftGear(int gear){
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

    public void accelerate(int speed) {
        if (!isEngineOn){
            System.out.println(brand+" "+model+": Engine is off. Can not accelerate the car");
            return;
        }
        currentSpeed += speed;
        System.out.println(brand+" "+model+": car accelerated to "+currentSpeed);
    }


    public void breakCar() {
        if (!isEngineOn){
            System.out.println(brand+" "+model+": Engine is Off");
            return;
        }
        currentSpeed -= 20;
        if (currentSpeed <= 0){
            currentSpeed = 0;
        }
        System.out.println(brand+" "+model+": Breaking! Current speed is "+currentSpeed);
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


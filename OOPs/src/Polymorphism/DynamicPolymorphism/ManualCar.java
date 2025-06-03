package Polymorphism.DynamicPolymorphism;

import Inheritence.Car;

public class ManualCar extends Car {

    private int currentGear;

    public ManualCar(String brand, String model){
        super(brand, model);
        this.currentGear = 0;
    }

    public void shiftGear(int gear){
        if (!isEngineOn){
            System.out.println(brand+" "+model+": Engine is off. Can not shift the gear");
            return;
        }
        currentGear = gear;
        System.out.println(brand+" "+model+": Gear shifted to "+gear);
    }


    //specific implementation for Manual car
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
            System.out.println(brand+" "+model+": Engine is Off");
            return;
        }
        currentSpeed -= 20;
        if (currentSpeed <= 0){
            currentSpeed = 0;
        }
        System.out.println(brand+" "+model+": Breaking! Current speed is "+currentSpeed);
    }
}

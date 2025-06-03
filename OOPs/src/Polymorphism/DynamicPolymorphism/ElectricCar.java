package Polymorphism.DynamicPolymorphism;

import Inheritence.Car;

public class ElectricCar extends Car {

    private int battery;

    public ElectricCar(String brand, String model){
        super(brand, model);
        this.battery = 100;
    }

    public void chargeBattery(){
        battery = 100;
        System.out.println("Battery fully charged.");
    }

    //specific implementation for Electric car
    @Override
    public void accelerate() {
        if (!isEngineOn){
            System.out.println(brand+" "+model+": cannot accelerate, Engine is Off");
            return;
        }
        if (battery <= 0){
            System.out.println(brand+" "+model+": Battery is dead. Cannot accelerate");
            return;
        }
        battery += 5;
        currentSpeed += 15;
        System.out.println(brand+" "+model+": Car accelerated to "+currentSpeed+". Battery is "+battery);
    }


    @Override
    public void breakCar() {
        if (!isEngineOn){
            System.out.println(brand+" "+model+": Engine is Off");
            return;
        }
        currentSpeed -= 22;
        if (currentSpeed <= 0){
            currentSpeed = 0;
        }
        System.out.println(brand+" "+model+": Breaking! Current speed is "+currentSpeed);
    }

}

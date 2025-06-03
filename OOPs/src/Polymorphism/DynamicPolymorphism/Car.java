package Polymorphism.DynamicPolymorphism;

public abstract class Car {

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




    public void stopEngine() {
        if (!isEngineOn){
            System.out.println(brand+" "+model+": Engine is already off.");
            return;
        }
        isEngineOn = false;
        currentSpeed = 0;
        System.out.println(brand+" "+model+": Engine stopped");
    }

    public abstract void accelerate();

    public abstract void breakCar() ;
}

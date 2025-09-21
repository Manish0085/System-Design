package Polymorphism.StaticPolymorphism;

public class ManualCar {

    private String brand;
    private String model;
    private boolean isEngineOn;
    private int currentSpeed;
    private int currentGear;


    public ManualCar(String brand, String model){
        this.brand = brand;
        this.model = model;
        this.currentGear = 0;
        this.currentSpeed = 0;
        this.isEngineOn = false;
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


    public void accelerate() {
        if(!isEngineOn){
            System.out.println(brand + " " + model+ ": Engine is off!!! Cannot accelerate.");
            return;
        }
        currentSpeed += 20;
        System.out.println(brand + " " + model+ ": Engine accelerated to speed "+currentSpeed+" km/h");
    }



    public void accelerate(int speed) {
        if(!isEngineOn){
            System.out.println(brand + " " + model+ ": Engine is off!!! Cannot accelerate.");
            return;
        }
        currentSpeed += speed;
        System.out.println(brand + " " + model+ ": Engine accelerated to speed "+currentSpeed+" km/h");
    }


    public void brake() {
        if(!isEngineOn){
            System.out.println(brand + " " + model+ ": Engine is already off!!!");
            return;
        }
        currentSpeed -= 20;
        if (currentSpeed < 0)
            currentSpeed = 0;
        System.out.println(brand + " " + model+ ": Breaking! Speed is now "+currentSpeed+" km/h");

    }

    public void shiftGear(int gear){
        if(!isEngineOn){
            System.out.println(brand + " " + model+ ": Engine is off!!! Cannot shift Gear.");
            return;
        }
        currentGear = gear;
        System.out.println(brand + " " + model+ ": Shifted to gear "+ currentGear);
    }

}

package Polymorphism.DynamicPolymorphism;

public class ManualCar extends Car {

    private int currentGear;

    public ManualCar(String brand, String model) {
        super(brand, model);
        this.currentGear = 0;
    }

    @Override
    public void accelerate() {
        if(!isEngineOn){
            System.out.println(brand + " " + model+ ": Engine is off!!! Cannot accelerate.");
            return;
        }
        currentSpeed += 20;
        System.out.println(brand + " " + model+ ": Engine accelerated to speed "+currentSpeed+" km/h");
    }


    @Override
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

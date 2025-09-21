package Polymorphism.DynamicPolymorphism;

public class ElectricCar extends Car {


    private int battteryLevel;

    public ElectricCar(String brand, String model) {
        super(brand, model);
        this.battteryLevel = 100;
    }

    public void chargeBatttery(){
        battteryLevel = 100;
        System.out.println(brand + " " + model + ": Battery is fully charged");
    }

    @Override
    public void accelerate() {
        if(!isEngineOn){
            System.out.println(brand + " "+ model+": Cannot accelerate! Engine is off!!");
            return;
        }

        if (battteryLevel <= 10){
            System.out.println(brand + " "+ model+": Cannot accelerate! Battery id dead");
            return;
        }
        battteryLevel -= 2;
        currentSpeed += 15;
        System.out.println(brand + " " + model + ": Accelerating to "+ currentSpeed+ " km/h. Battery at "+ battteryLevel+ "%.");
    }

    @Override
    public void brake() {
        if(!isEngineOn){
            System.out.println(brand + " " + model+ ": Engine is already off!!!");
            return;
        }
        currentSpeed -= 15;
        if(currentSpeed < 0)
            currentSpeed = 0;
        System.out.println(brand + " " + model+ ": Breaking! Speed is now "+currentSpeed+" km/h");

    }
}

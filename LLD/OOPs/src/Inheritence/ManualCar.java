package Inheritence;

public class ManualCar extends Car{

    private int currentGear;

    public ManualCar(String brand, String model) {
        super(brand, model);
        this.currentGear = 0;
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

package Inheritence;

public class ElectricCar extends Car{

    private int batteryLevel;

    public ElectricCar(String brand, String model) {
        super(brand, model);
        this.batteryLevel = 100;
    }

    void chargeBattery(){
        batteryLevel = 100;
        System.out.println(brand+" "+model+": Battery is fully charged!!");
    }
}

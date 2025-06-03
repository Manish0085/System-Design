package Inheritence;

public class ElectricCar extends Car{

    private int battery;

    public ElectricCar(String brand, String model){
        super(brand, model);
        this.battery = 100;
    }

    public void chargeBattery(){
        battery = 100;
        System.out.println("Battery fully charged.");
    }

    public void drive(int distance) {
        int batteryUsed = distance / 2; // assume 1% battery per 2km
        battery -= batteryUsed;

        if (battery <= 0) {
            battery = 0;
            System.out.println("Battery dead. Please recharge.");
        } else {
            System.out.println("Drove " + distance + " km. Battery now at " + battery + "%.");
        }
    }

    public boolean isBatteryDead() {
        return battery == 0;
    }

}

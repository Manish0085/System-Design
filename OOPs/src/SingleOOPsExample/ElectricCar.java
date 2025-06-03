package SingleOOPsExample;

public class ElectricCar extends Car{

    private int battery;


    public ElectricCar(String brand, String model){
        super(brand, model);
        this.battery = 100;
    }

    @Override
    public void accelerate() {
        if (!isEngineOn){
            System.out.println(brand+" "+model+": Engine is Off. Cannot Accelerate");
            return;
        }
        if(battery <= 0){
            battery = 0;
            System.out.println(brand+" "+model+": Battery is dead. Cannot Accelerate");
            return;
        }
        battery -= 5;
        currentSpeed += 15;
        System.out.println(brand+" "+model+": Accelerating, Current speed is "+currentSpeed);
    }

    @Override
    public void accelerate(int speed) {
        if (!isEngineOn){
            System.out.println(brand+" "+model+": Engine is Off. Cannot Accelerate");
            return;
        }
        if(battery <= 0){
            battery = 0;
            System.out.println(brand+" "+model+": Battery is dead. Cannot Accelerate");
            return;
        }
        battery -= 8;
        currentSpeed += speed;
        System.out.println(brand+" "+model+": Accelerating, Current speed is "+currentSpeed);
    }

    @Override
    public void breakCar() {
        if (!isEngineOn){
            System.out.println(brand+" "+model+": Engine is Off. Cannot break");
            return;
        }
        currentSpeed -= 15;
        System.out.println(brand+" "+model+": Car is breaking to "+currentSpeed);
    }

    public void chargeBattery(){
        battery = 100;
        System.out.println(brand+" "+model+": Battery is charged");
    }
}

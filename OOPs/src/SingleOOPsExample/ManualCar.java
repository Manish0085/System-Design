package SingleOOPsExample;

public class ManualCar extends Car{

    private int currentGear;

    public ManualCar(String brand, String model){
        super(brand, model);
        this.currentGear = 0;
    }
    @Override
    public void accelerate() {
        if (!isEngineOn){
            System.out.println(brand+" "+model+": Engine is Off. Cannot accelerate");
            return;
        }
        currentSpeed += 20;
        System.out.println(brand+" "+model+": Car is accelerated to "+currentSpeed);
    }

    @Override
    public void accelerate(int speed) {
        if (!isEngineOn){
            System.out.println(brand+" "+model+": Engine is Off. Cannot accelerate");
            return;
        }
        currentSpeed += speed;
        System.out.println(brand+" "+model+": Car is accelerated to "+currentSpeed);
    }

    @Override
    public void breakCar() {
        if (!isEngineOn){
            System.out.println(brand+" "+model+": Engine is Off. Cannot break");
            return;
        }
        currentSpeed -= 20;
        System.out.println(brand+" "+model+": Car is breaking to "+currentSpeed);
    }


    //Specific to Manual Car
    public void shiftGear(int gear){
        if (!isEngineOn){
            System.out.println(brand+" "+model+": Engine is off. Can not shift the gear");
            return;
        }
        currentGear = gear;
        System.out.println(brand+" "+model+": Gear shifted to "+gear);
    }
}

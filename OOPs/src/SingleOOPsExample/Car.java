package SingleOOPsExample;

public abstract class Car {

    protected String brand;
    protected String model;
    protected int currentSpeed;
    protected boolean isEngineOn;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.currentSpeed = 0;
        this.isEngineOn = false;
    }

    public void startEngine(){
        if (!isEngineOn){
            isEngineOn = true;
            System.out.println(brand+" "+model+": Engine started");
            return;
        }
        System.out.println(brand+" "+model+": Engine is  already on");
    }



    public void stopEngine(){
        if (!isEngineOn){
            System.out.println(brand+" "+model+": Engine already stop");
            return;
        }
        isEngineOn = false;
        System.out.println(brand+" "+model+": Engine is  turned off");
    }

    public abstract void accelerate();

    public abstract void accelerate(int speed);

    public abstract void breakCar();
}

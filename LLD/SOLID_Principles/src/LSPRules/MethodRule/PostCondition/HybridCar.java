package LSPRules.MethodRule.PostCondition;

public class HybridCar extends Car{

    private int charging;

    public HybridCar(){
        super();
        this.charging = 0;
    }


    // PostCondition: Speed must reduce after brake
    // PostCondition: Charge must increase.
    @Override
    public void brake() {
        System.out.println("Applying brakes");
        speed -= 20;
        charging += 10;
    }
}

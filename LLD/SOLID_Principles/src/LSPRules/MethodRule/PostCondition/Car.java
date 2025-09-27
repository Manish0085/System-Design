package LSPRules.MethodRule.PostCondition;


// A Postcondition must be satisfied after a method is executed.
// Subclasses can strengthen the Postcondition but cannot weaken it.
public class Car {

    protected int speed;

    public Car(){
        this.speed = 0;
    }

    public void accelerate(){
        System.out.println("Accelerating...");
        this.speed += 20;
    }

    public void brake(){
        System.out.println("Braking...");
        this.speed -= 15;
    }
}

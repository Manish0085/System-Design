package StrategyDesignPatttern;

public class NoFly implements FlybleRobot{
    @Override
    public void fly() {
        System.out.println("Cannot fly");
    }
}

package StrategyDesignPatttern;

public class NoWalk implements WalkableRobot{
    @Override
    public void walk() {
        System.out.println("Cannot Walk");
    }
}

package StrategyDesignPatttern;

public class CompanionR extends Robot{


    public CompanionR(TalkableRobot t, WalkableRobot w, FlybleRobot f) {
        super(t, w, f);
    }

    @Override
    public void proojection() {
        System.out.println("Displaying Friendly companion features...");
    }
}

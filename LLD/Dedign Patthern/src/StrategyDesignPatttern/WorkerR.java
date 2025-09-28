package StrategyDesignPatttern;

public class WorkerR extends Robot{


    public WorkerR(TalkableRobot t, WalkableRobot w, FlybleRobot f) {
        super(t, w, f);
    }

    @Override
    public void proojection() {
        System.out.println("Displaying worker efficiency states...");
    }
}

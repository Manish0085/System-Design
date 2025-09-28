package StrategyDesignPatttern;

public abstract class Robot {

    private TalkableRobot talkableRobot;
    private WalkableRobot walkableRobot;
    private FlybleRobot flybleRobot;

    public Robot(TalkableRobot t, WalkableRobot w, FlybleRobot f) {
        this.talkableRobot = t;
        this.walkableRobot = w;
        this.flybleRobot = f;
    }

    public void walk(){
        walkableRobot.walk();;
    }

    public void talk(){
        talkableRobot.talk();
    }

    public void fly(){
        flybleRobot.fly();
    }


    abstract public void proojection();
}

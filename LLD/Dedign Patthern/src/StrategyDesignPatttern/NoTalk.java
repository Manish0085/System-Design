package StrategyDesignPatttern;

public class NoTalk implements TalkableRobot{
    @Override
    public void talk() {
        System.out.println("Cannot talk");
    }
}

package StrategyDesignPatttern;

public class NormalTalk implements TalkableRobot{
    @Override
    public void talk() {
        System.out.println("Talking normally");
    }
}

package StrategyDesignPatttern;

public class StartegyDesignPattern {

    public static void main(String[] args) {
        Robot robot1 = new CompanionR(new NormalTalk(),
                new NormalWalk(),
                new NoFly());

        robot1.talk();
        robot1.walk();
        robot1.fly();
        robot1.proojection();

        System.out.println("-------------------------------");

        Robot robot2 = new WorkerR(new NormalTalk(),
                new NoWalk(),
                new NoFly());

        robot2.talk();
        robot2.walk();
        robot2.fly();
        robot2.proojection();
    }
}

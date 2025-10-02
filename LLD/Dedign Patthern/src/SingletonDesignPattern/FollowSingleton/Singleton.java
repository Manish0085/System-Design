package FactoryDesigPattern.SingletonDesignPattern.FollowSingleton;

public class Singleton {

    private static Singleton instance;

    private Singleton(){
        System.out.println("Single object of Singleton class is created");
    }

    public static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}

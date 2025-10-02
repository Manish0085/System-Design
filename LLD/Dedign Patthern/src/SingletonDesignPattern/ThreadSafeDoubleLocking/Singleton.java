package FactoryDesigPattern.SingletonDesignPattern.ThreadSafeDoubleLocking;

public class Singleton {

    private static Singleton instance;

    private Singleton(){
        System.out.println("Single object of Singleton class is created");
    }

    public static Singleton getInstance(){
            if (instance == null) {
                synchronized (Singleton.class){
                    if(instance == null){
                        instance = new Singleton();
                    }
                }
        }
        return instance;
    }
}

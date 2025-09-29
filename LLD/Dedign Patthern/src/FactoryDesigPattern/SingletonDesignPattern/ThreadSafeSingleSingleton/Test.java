package FactoryDesigPattern.SingletonDesignPattern.ThreadSafeSingleSingleton;

public class Test {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println("s1 == s2(thread safe Single locking): " + (s1 == s2));
    }
}

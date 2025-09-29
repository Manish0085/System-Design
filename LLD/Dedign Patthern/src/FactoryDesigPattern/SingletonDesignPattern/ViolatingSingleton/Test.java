package FactoryDesigPattern.SingletonDesignPattern.ViolatingSingleton;

public class Test {

    public static void main(String[] args) {
        Singleton s1 = new Singleton();
        Singleton s2 = new Singleton();

        System.out.println("s1 == s2: " + (s1 == s2));
    }
}

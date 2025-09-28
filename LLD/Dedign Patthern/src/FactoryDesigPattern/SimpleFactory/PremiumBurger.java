package FactoryDesigPattern.SimpleFactory;

public class PremiumBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Preparing Premium Burger with Bun, premium patty and ketchup and secret sauce");
    }
}

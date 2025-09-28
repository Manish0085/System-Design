package FactoryDesigPattern.SimpleFactory;

public class BasicBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Preparing Basic Burger with Bun, patty and ketchup");
    }
}

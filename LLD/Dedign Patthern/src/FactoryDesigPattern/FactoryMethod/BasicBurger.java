package FactoryDesigPattern.FactoryMethod;

public class BasicBurger implements Burger{

    @Override
    public void prepare() {
        System.out.println("Preparing Basic Burger with bun, patty, and ketchup!");
    }
}

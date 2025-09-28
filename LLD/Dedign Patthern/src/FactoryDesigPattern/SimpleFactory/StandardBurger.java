package FactoryDesigPattern.SimpleFactory;

public class StandardBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Preparing Standard Burger with Bun, patty, cheese and lettuce");
    }
}

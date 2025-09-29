package FactoryDesigPattern.FactoryMethod;

public class SinghBurger implements BurgerFactory{
    @Override
    public Burger createBurger(String type) {
        if ("basic".equalsIgnoreCase(type))
            return new BasicBurger();
        else if("standard".equalsIgnoreCase(type))
            return new StandardBurger();
        else if("premium".equalsIgnoreCase(type))
            return new PremiumBurger();
        else {
            System.out.println("Invalid burger type!");
            return null;
        }

    }
}

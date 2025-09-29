package FactoryDesigPattern.FactoryMethod;

public class KingBurger implements BurgerFactory{
    @Override
    public Burger createBurger(String type) {
        if ("basic".equalsIgnoreCase(type))
            return new BasicWheatBurger();
        else if("standard".equalsIgnoreCase(type))
            return new StandardWheatBurger();
        else if("premium".equalsIgnoreCase(type))
            return new PremiumWheatBurger();
        else {
            System.out.println("Invalid burger type!");
            return null;
        }

    }
}

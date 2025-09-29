package FactoryDesigPattern.FactoryMethod;

import java.util.Scanner;

public class Test{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the type of Burger: ");
        String type = sc.next();

        BurgerFactory burgerFactory = new KingBurger();

        Burger burger = burgerFactory.createBurger(type);

        if (burger != null){
            burger.prepare();
        }
    }
}

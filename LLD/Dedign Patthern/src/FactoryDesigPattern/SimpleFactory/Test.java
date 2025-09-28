package FactoryDesigPattern.SimpleFactory;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the burger type ");
        String type = sc.next();

        BurgerFactory burgerFactory = new BurgerFactory();
        Burger burger = burgerFactory.createBurger(type);

        burger.prepare();
    }
}

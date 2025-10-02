package Zomato;

import Zomato.model.Order;
import Zomato.model.Restaurant;
import Zomato.model.User;
import Zomato.strategies.UpiPaymentStrategy;

import java.util.List;

public class Test {

    public static void main(String[] args) {

        // Simulate a happy flow
        // Create ZomatoApp Object
        ZomatoApp app = new ZomatoApp();

        // Simulate a user coming in Happy flow
        User user = new User("Manish", "Delhi");
        System.out.println("User: " + user.getName() + " is active.");

        List<Restaurant> restaurants = app.searchByLocation("Delhi");

        if (restaurants.isEmpty()){
            System.out.println("No restaurant is found");
            return;
        }

        System.out.println("Found Restaurants: ");
        for (Restaurant restaurant: restaurants){
            System.out.println(" - " + restaurant.getName());
        }

        app.selectRestaurant(user, restaurants.get(0));
        System.out.println("Selected Restaurant: " + restaurants.get(0).getName());

        app.addToCart(user, "P1");
        app.addToCart(user, "P2");

        app.printUserCart(user);

        Order order = app.checkoutNow(user, "Delivery", new UpiPaymentStrategy("1245369879"));

        app.payForOrder(user, order);

    }
}

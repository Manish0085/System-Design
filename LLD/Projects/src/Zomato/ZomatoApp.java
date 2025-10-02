package Zomato;

import Zomato.factories.NowOrderFactory;
import Zomato.factories.OrderFactory;
import Zomato.factories.ScheduledOrderFactory;
import Zomato.managers.OrderManager;
import Zomato.managers.RestaurantManager;
import Zomato.model.*;
import Zomato.service.NotificationService;
import Zomato.strategies.PaymentStrategy;

import java.util.List;

public class ZomatoApp {

    public ZomatoApp(){
        initializeRestaurant();
    }

    public void initializeRestaurant(){
        Restaurant restaurant1 = new Restaurant("Bikaner", "Delhi");
        restaurant1.addMenuItem(new MenuItem("P1", "Chole Bhature", 120));
        restaurant1.addMenuItem(new MenuItem("P2", "Samosa", 15));


        Restaurant restaurant2 = new Restaurant("Haldiram", "Kolkata");
        restaurant2.addMenuItem(new MenuItem("P1", "Raj Kachori", 80));
        restaurant2.addMenuItem(new MenuItem("P2", "Pav Bhaji", 100));
        restaurant2.addMenuItem(new MenuItem("P3", "Dhokla", 50));


        Restaurant restaurant3 = new Restaurant("Saravana Bhavan", "Chennai");
        restaurant2.addMenuItem(new MenuItem("P1", "Masala Dosa", 90));
        restaurant2.addMenuItem(new MenuItem("P2", "Idli Vada", 60));
        restaurant2.addMenuItem(new MenuItem("P3", "Filter Coffee", 30));


        RestaurantManager manager = RestaurantManager.getInstance();
        manager.addRestaurant(restaurant1);
        manager.addRestaurant(restaurant2);
        manager.addRestaurant(restaurant3);

    }

    public List<Restaurant> searchByLocation(String location){
        return RestaurantManager.getInstance().searchByLocation(location);
    }


    public void selectRestaurant(User user, Restaurant restaurant){
        Cart cart = user.getCart();
        cart.setRestaurant(restaurant);
    }

    public void addToCart(User user, String itemCode){
        Restaurant restaurant = user.getCart().getRestaurant();
        if (restaurant == null){
            System.out.println("Please select a restaurant first.");
        }

        for (MenuItem it: restaurant.getMenu()){
            if (it.getCode().equalsIgnoreCase(itemCode)){
                user.getCart().addItem(it);
                break;
            }
        }
    }

    public Order checkoutNow(User user, String orderType, PaymentStrategy strategy){
        return checkout(user, orderType, strategy, new NowOrderFactory());
    }

    public Order checkoutScheduled(User user, String orderType, PaymentStrategy strategy, String time){
        return checkout(user, orderType, strategy, new ScheduledOrderFactory(time));
    }

    public Order checkout(User user, String orderType, PaymentStrategy strategy, OrderFactory orderFactory){
        if (user.getCart().isEmpty())
            return null;

        Cart userCart = user.getCart();
        Restaurant orderedRestaurant = userCart.getRestaurant();
        List<MenuItem> items = userCart.getItems();
        double totalCost = userCart.getTotalCost();


        Order order = orderFactory.createOrder(user, userCart, orderedRestaurant, items, strategy, totalCost, orderType);
        OrderManager.getInstance().addOrder(order);
        return order;

    }


    public void payForOrder(User user, Order order){
        boolean isPaymentSuccess = order.processPayment();
        if (isPaymentSuccess){
            NotificationService.notify(order);
            user.getCart().clear();
        }
    }

    public void printUserCart(User user){
        System.out.println("Items in Cart: ");
        System.out.println("-----------------------------------");
        for (MenuItem item: user.getCart().getItems()){
            System.out.println(item.getCode() + " : " + item.getName() + " : ₹" + item.getPrice());
        }
        System.out.println("-----------------------------------");
        System.out.println("Grand Total: ₹" + user.getCart().getTotalCost());
    }
}

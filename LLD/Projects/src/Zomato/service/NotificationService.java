package Zomato.service;

import Zomato.model.MenuItem;
import Zomato.model.Order;

import java.util.List;

public class NotificationService {


    public static void notify(Order order){
        System.out.println("\nNotification: New " + order.getType() + " order placed!");
        System.out.println("---------------------------------------------------------");
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Customer: " + order.getUser().getName());
        System.out.println("Restaurant: " + order.getRestaurant().getName());
        System.out.println("Item Ordered: ");
        List<MenuItem> items = order.getItems();
        for (MenuItem item: items){
            System.out.println("   - " + item.getName() + " (₹" + item.getPrice() + ")");
        }

        System.out.println("Total: ₹" + order.getTotal());
        System.out.println("Scheduled for: " + order.getScheduled());
        System.out.println("Payment: Done");
        System.out.println("---------------------------------------------------------");


    }

}

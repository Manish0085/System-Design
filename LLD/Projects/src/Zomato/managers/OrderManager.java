package Zomato.managers;

import Zomato.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {

    public List<Order> orders = new ArrayList<>();
    public static OrderManager instance = null;

    private OrderManager(){

    }

    public static OrderManager getInstance(){
        if (instance == null){
            instance = new OrderManager();
        }
        return instance;
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    public void listOrders(){
        System.out.println("\n--- All Orders ---");
        for (Order order: orders){
            System.out.println(order.getType() + " order for " + order.getUser().getName()
            + " | Total: ₹" + order.getTotal()
            + " | At: " + order.getScheduled());
        }
    }
}

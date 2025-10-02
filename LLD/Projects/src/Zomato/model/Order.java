package Zomato.model;

import Zomato.strategies.PaymentStrategy;

import java.util.List;

public abstract class Order {

    private static int nextOrderId = 0;

    protected int orderId;
    protected User user;
    protected Restaurant restaurant;
    protected List<MenuItem> items;
    protected PaymentStrategy paymentStrategy;
    protected double total;
    protected String scheduled;


    public Order() {
        this.user = null;
        this.restaurant = null;
        this.paymentStrategy = null;
        this.total = 0.0;
        this.scheduled = null;
        this.orderId = ++nextOrderId;
    }


    public boolean processPayment(){
        if (paymentStrategy != null){
            paymentStrategy.pay(total);
            return true;
        }
        else {
            System.out.println("Please chose a payment mode first");
            return false;
        }
    }


    public abstract String getType();

    public int getOrderId() {
        return orderId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
    }


    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getScheduled() {
        return scheduled;
    }

    public void setScheduled(String scheduled) {
        this.scheduled = scheduled;
    }
}

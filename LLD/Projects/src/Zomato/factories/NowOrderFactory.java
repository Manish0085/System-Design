package Zomato.factories;

import Zomato.model.*;
import Zomato.strategies.PaymentStrategy;
import Zomato.utils.TimeUtils;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class NowOrderFactory implements OrderFactory{


    @Override
    public Order createOrder(User user, Cart cart, Restaurant restaurant, List<MenuItem> menuItems, PaymentStrategy strategy, double totalCost, String orderType) {

        Order order = null;
        if (orderType.equalsIgnoreCase("Delivery")){
            DeliveryOrder deliveryOrder = new DeliveryOrder();
            deliveryOrder.setUserAddress(user.getAddress());
            order = deliveryOrder;
        } else if(orderType.equalsIgnoreCase("Pickup")){
            PickupOrder pickupOrder = new PickupOrder();
            pickupOrder.setRestaurantAddress(restaurant.getLocation());
            order = pickupOrder;
        }



        order.setUser(user);
        order.setRestaurant(restaurant);
        order.setItems(menuItems);
        order.setPaymentStrategy(strategy);
        order.setScheduled(TimeUtils.getCurrentTime());
        order.setTotal(totalCost);
        return order;
    }
}

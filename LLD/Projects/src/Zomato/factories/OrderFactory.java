package Zomato.factories;

import Zomato.model.*;
import Zomato.model.MenuItem;
import Zomato.strategies.PaymentStrategy;
import org.w3c.dom.css.Rect;

import java.awt.*;
import java.util.List;

public interface OrderFactory {


    Order createOrder(User user, Cart cart, Restaurant restaurant, List<MenuItem> menuItems,
                      PaymentStrategy strategy, double totalCost, String orderType);
}

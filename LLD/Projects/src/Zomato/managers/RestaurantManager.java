package Zomato.managers;

import Zomato.model.Restaurant;

import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RestaurantManager {


    private List<Restaurant> restaurants = new ArrayList<>();
    private static RestaurantManager instance = null;

    private RestaurantManager(){

    }


    // Singleton Bean of Restaurant Class
    public static RestaurantManager getInstance(){
        if (instance == null){
            instance = new RestaurantManager();
        }
        return instance;
    }

    public void addRestaurant(Restaurant restaurant){
        restaurants.add(restaurant);
    }

    public List<Restaurant> searchByLocation(String loc) {
        String location = loc.toLowerCase();
        return restaurants.stream()
                .filter(r -> r.getLocation() != null && r.getLocation().toLowerCase().equals(location))
                .collect(Collectors.toList());
    }

}

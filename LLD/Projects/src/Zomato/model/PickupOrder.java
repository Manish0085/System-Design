package Zomato.model;

public class PickupOrder extends Order{

    private String restaurantAddress;


    public PickupOrder(){
        this.restaurantAddress = "";
    }

    @Override
    public String getType() {
        return "Pickup";
    }

    public void setRestaurantAddress(String add){
        this.restaurantAddress = add;
    }

    public String getRestaurantAddress(){
        return this.restaurantAddress;
    }
}

package SRP.WithSRP;

public class DBStorage {

    private ShoppingCart cart;

    public DBStorage(ShoppingCart cart){
        this.cart = cart;
    }

    public void sveToDB(){
        System.out.println("Saving shopping cart to database");
    }
}

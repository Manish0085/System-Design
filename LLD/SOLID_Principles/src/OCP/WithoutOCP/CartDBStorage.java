package OCP.WithoutOCP;

public class CartDBStorage
{

    private ShoppingCart cart;

    public CartDBStorage(ShoppingCart cart){
        this.cart = cart;
    }

    public void saveToDB(){
        System.out.println("Saving Shopping cart to Database");
    }


    public void saveToFile(){
        System.out.println("Saving Shopping cart to File");
    }
    public void saveToMongo(){
        System.out.println("Saving Shopping cart to Mongo Database(No SQL Database)");
    }

}

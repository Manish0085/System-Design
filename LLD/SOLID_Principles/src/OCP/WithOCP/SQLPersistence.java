package OCP.WithOCP;

public class SQLPersistence implements Persistence{

    @Override
    public void save(ShoppingCart cart) {
        System.out.println("Saving Cart to SQL Database");
    }
}

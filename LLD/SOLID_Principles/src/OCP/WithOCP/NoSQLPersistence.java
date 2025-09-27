package OCP.WithOCP;

public class NoSQLPersistence implements Persistence{


    @Override
    public void save(ShoppingCart cart) {
        System.out.println("Saving Cart to N-SQL Database");
    }
}

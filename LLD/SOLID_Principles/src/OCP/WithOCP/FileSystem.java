package OCP.WithOCP;

public class FileSystem implements Persistence{


    @Override
    public void save(ShoppingCart cart) {
        System.out.println("Saving Cart to File");
    }
}

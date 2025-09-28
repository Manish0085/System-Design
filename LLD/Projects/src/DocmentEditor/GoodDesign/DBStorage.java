package DocmentEditor.GoodDesign;

import java.io.FileWriter;
import java.io.IOException;

public class DBStorage implements Persistence{


    @Override
    public void save(String data) {
        System.out.println("Document saved to database");
    }
}

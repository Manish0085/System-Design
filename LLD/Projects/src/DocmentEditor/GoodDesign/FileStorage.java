package DocmentEditor.GoodDesign;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileStorage implements Persistence{


    @Override
    public void save(String data) {
        try (FileWriter writer = new FileWriter("document1.txt")){
            writer.write(data);
            writer.close();
            System.out.println("Document saved to document.txt");
        } catch (IOException e){
            System.out.println("Error: Unable to open file for writing.");
        }
    }
}

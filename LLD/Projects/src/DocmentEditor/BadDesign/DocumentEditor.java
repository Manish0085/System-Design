package DocmentEditor.BadDesign;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/*
    This brakes Single responsibility and Open/closed principle
 */
public class DocumentEditor {

    private List<String> documentElements;
    private String renderDocument;

    public DocumentEditor(){
        this.documentElements = new ArrayList<>();
        this.renderDocument = "";
    }

    public List<String> getDocumentElements() {
        return documentElements;
    }

    public void addText(String text){
        this.documentElements.add(text);
        renderDocument = null;
    }

    public void addImage(String imagePath){
        this.documentElements.add(imagePath);
        renderDocument = null;
    }

    private boolean isImage(String path){
        return path.endsWith(".png") || path.endsWith(".jpg") || path.endsWith(".gif");
    }

    public String renderDoc(){
        if (renderDocument == null){
            StringBuilder result = new StringBuilder();
            for (String el: documentElements){
                if (isImage(el)){
                    result.append("[Image: ").append(el).append("]\n");
                } else {
                    result.append(el).append("\n");
                }
            }
            renderDocument = result.toString();
        }
        return renderDocument;
    }


    public void saveToFile(){
        try (FileWriter writer = new FileWriter("document.txt")){
            writer.write(renderDoc());
            System.out.println("Document save to Document.txt");
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }


}

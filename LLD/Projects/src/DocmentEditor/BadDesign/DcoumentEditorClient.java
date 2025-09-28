package DocmentEditor.BadDesign;

import javax.swing.*;
import java.awt.*;

public class DcoumentEditorClient extends JFrame {

    public DcoumentEditorClient(DocumentEditor editor){
        setTitle("Document Viewer");
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        for (String element: editor.getDocumentElements()){
            if (isImage(element)){
                ImageIcon icon = new ImageIcon(element);
                Image image = icon.getImage();
                Image scale = image.getScaledInstance(200, 150, Image.SCALE_SMOOTH);
                JLabel imgLabel = new JLabel(new ImageIcon(scale));
                add(imgLabel);
            }
            else {
                JLabel textLabel = new JLabel(element);
                textLabel.setFont(new Font("Arial", Font.PLAIN, 16));
                add(textLabel);
            }

        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }



    private boolean isImage(String path){
        return path.endsWith(".png") || path.endsWith(".jpg") || path.endsWith(".gif");
    }


    public static void main(String[] args) {
        DocumentEditor editor = new DocumentEditor();

        editor.addText("Hello, world!");
        editor.addImage("D:\\System Design\\LLD\\Projects\\src\\resource\\Screenshot 2025-09-22 104832.png"); // Make sure picture.jpg exists in project folder
        editor.addText("This is a document editor.");

        System.out.println(editor.renderDoc());
        editor.saveToFile();

        // GUI with real image
        new DcoumentEditorClient(editor);
    }
}

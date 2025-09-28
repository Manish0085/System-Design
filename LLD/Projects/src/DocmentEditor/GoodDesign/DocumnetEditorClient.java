package DocmentEditor.GoodDesign;

public class DocumnetEditorClient {

    public static void main(String[] args) {
        Document doc = new Document();
        Persistence storage = new FileStorage();

        DocumentEditor editor = new DocumentEditor(doc, storage);

        editor.addText("Hello Dosto");
        editor.addNewLine();
        editor.addText("This is a real-world document editor example.");
        editor.addNewLine();
        editor.addTabSpace();
        editor.addText("Indented text after a tab space.");
        editor.addNewLine();
        editor.addImage("<your-image-path");

        System.out.println(editor.render());

        editor.setStrage();

    }
}

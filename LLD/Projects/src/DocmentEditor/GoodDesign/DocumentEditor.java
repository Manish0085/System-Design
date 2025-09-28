package DocmentEditor.GoodDesign;

public class DocumentEditor {


    private Document document;
    private Persistence storage;
    private String renderDoc = "";

    public DocumentEditor(Document document, Persistence storage) {
        this.document = document;
        this.storage = storage;
    }

    public void addText(String text){
        document.addElement(new TextElement(text));
    }

    public void addImage(String imagePath){
        document.addElement(new ImageElement(imagePath));
    }

    public void addNewLine(){
        document.addElement(new NewLineElement());
    }

    public void addTabSpace(){
        document.addElement(new TabSpaceElement());
    }


    public String render(){
        if (renderDoc.isEmpty() || renderDoc == null){
            renderDoc = document.render();
        }
        return renderDoc;
    }

    public void setStrage(){
        storage.save(render());
    }

}

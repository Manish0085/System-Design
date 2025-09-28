package DocmentEditor.GoodDesign;

import java.util.ArrayList;
import java.util.List;

public class Document {

    private List<DocumentElement> elements;

    public Document(){
        this.elements = new ArrayList<>();
    }

    public void addElement(DocumentElement element){
        this.elements.add(element);
    }

    public String render(){
        StringBuilder result = new StringBuilder();
        for (DocumentElement el: elements){
            result.append(el.render());
        }
        return result.toString();
    }
}

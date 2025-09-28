package DocmentEditor.GoodDesign;

import java.awt.*;

public class ImageElement implements DocumentElement{


    private String imgPath;

    public ImageElement(String path){
        this.imgPath = path;
    }


    @Override
    public String render() {
        return "[Image: " + imgPath + "]";
    }
}

package LSPRules.SignatureRule.ReturnTypeRule;

public class Test {

    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape rectangle = new Rectangle(); // LSP: Rectangle can substitute Shape
        Shape square = new Square();  // LSP: Square can substitute Shape

        square.getShape();
        shape.getShape();
        rectangle.getShape();
    }
}

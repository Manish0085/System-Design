package LSPRules.SignatureRule.ReturnTypeRule;

public class Square extends Shape{

    @Override
    public Square getShape() {     // ✅ Covariant return type
        System.out.println("Square Rectangle");
        return new Square();
    }
}

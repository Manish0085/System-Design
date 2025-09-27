package LSPRules.SignatureRule.ReturnTypeRule;

public class Rectangle extends Shape{

    @Override
    public Rectangle getShape() {     // ✅ Covariant return type
        System.out.println("Returning Rectangle");
        return new Rectangle();
    }
}

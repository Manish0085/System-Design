package LSPRules.SignatureRule.ReturnTypeRule;

public class Shape {

    public Shape getShape(){
        System.out.println("Returning Shape");
        return new Shape();
    }
}

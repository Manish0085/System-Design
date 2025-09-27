package LSPRules.SignatureRule.ReturnTypeRule.MethodArgumentRule;

public class Client {

    Parent p;

    public Client(Parent p){
        this.p = p;
    }

    public void printMsg(){
        p.print("Hello");
    }
}

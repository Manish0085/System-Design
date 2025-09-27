package LSPRules.SignatureRule.ReturnTypeRule.MethodArgumentRule;


public class Child extends Parent {


    @Override
    public void print(String msg) {
        System.out.println("Child: "+msg);
    }


    /*

    You cannot cant the method Argument
    @Override
    public void print(int  msg) {
        System.out.println("Child: "+msg);
    }

     */
}

package LSPRules.SignatureRule.MethodArgumentRule;

public class Test {

    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        Client client1 = new Client(parent);
        client1.printMsg();

        Client client2 = new Client(child);
        client2.printMsg();
    }
}

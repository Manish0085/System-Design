package LSP.WithoutLSP;

import java.util.List;

public class Test {

    private static final List<Account> accounts = List.of(
            new SavingAcount(),
            new CurrentAccount(),
            new FixedTermAccount()
    );

    public static void main(String[] args) {

        BankClient client = new BankClient(accounts);

        client.processTransaction();
    }
}

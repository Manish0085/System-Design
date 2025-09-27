package LSP.WithoutLSP;

import java.util.List;

public class BankClient {

    private List<Account> accounts;

    public BankClient(List<Account> accounts){
        this.accounts = accounts;
    }

    public void processTransaction(){
        for (Account acc: accounts){
            acc.deposite(1000.0);

            try {
                acc.withdraw(505.0);
            } catch (UnsupportedOperationException e){
                System.out.println("Exception: "+ e.getMessage());
            }
        }
    }
}

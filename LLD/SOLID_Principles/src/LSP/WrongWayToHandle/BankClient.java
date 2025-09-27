package LSP.WrongWayToHandle;

import java.util.List;

public class BankClient {

    private List<Account> accounts;

    public BankClient(List<Account> accounts){
        this.accounts = accounts;
    }

    public void processTransaction(){
        for (Account acc: accounts){
            acc.deposite(1000.0);

            if (acc instanceof FixedTermAccount){
                System.out.println("Skipping withdrawal for Fixed Term Account.");
            } else {
                try {
                    acc.withdraw(505);
                } catch (UnsupportedOperationException e){
                    System.out.println("Exception: "+e.getMessage());
                }
            }
        }
    }
}

package LSPRules.PropertyRule.HistoryConstraint;

public class BankAccount {

    private double balance;

    public BankAccount(double amount){
        if (amount < 0){
            throw new IllegalArgumentException("Balance can't be negative");
        }
        this.balance = amount;
    }

    public void withdraw(double amount){
        if (amount > balance){
            throw new IllegalArgumentException("Insufficient funds");
        }

        this.balance -= amount;
        System.out.println("Amount withdrawn. Remaining balance is " + balance);
    }

}

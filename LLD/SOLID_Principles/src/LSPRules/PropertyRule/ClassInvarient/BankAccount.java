package LSPRules.PropertyRule.ClassInvarient;


// 👉 Invariant: balance ≥ 0 must always hold.
public class BankAccount {

    protected double balance;

    public BankAccount(double initialAmount){
        if (initialAmount < 0){
            throw new IllegalArgumentException("Balance cannot be negative!!");
        }

        this.balance = initialAmount;
    }

    public void deposit(double amount){
        if (amount <= 0){
            throw new IllegalArgumentException("Deposit must be positive!!");
        }
        this.balance += amount;
    }

    public void withdraw(double amount){
        if (amount > balance){
            throw new IllegalArgumentException("Insufficient funds!!");
        }
        this.balance -= amount;
    }

    public double getBalance() {
        return this.balance;
    }
}

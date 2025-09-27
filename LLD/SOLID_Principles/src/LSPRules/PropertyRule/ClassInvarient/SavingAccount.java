package LSPRules.PropertyRule.ClassInvarient;

public class SavingAccount extends BankAccount {


    public SavingAccount(double initialAmount) {
        super(initialAmount);
    }

    @Override
    public void withdraw(double amount) {
        // ❌ allows overdraft (balance can go negative)
        this.balance -= amount;
    }
}

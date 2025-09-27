package LSPRules.PropertyRule.HistoryConstraint;

public class FixedDepositAccount extends BankAccount{


    public FixedDepositAccount(double amount) {
        super(amount);
    }


    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Withdraw not allowed in Fixed Deposit");
    }
}

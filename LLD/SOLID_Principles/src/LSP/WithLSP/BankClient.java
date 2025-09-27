package LSP.WithLSP;


import java.util.List;

public class BankClient {


    private List<NonWithdrawableAccount> nonWithdrawableAccounts;
    private List<WithdrawableAccount> withdrawableAccounts;

    public BankClient(List<NonWithdrawableAccount> nonWithdrawable, List<WithdrawableAccount> withdrawable){
        this.nonWithdrawableAccounts = nonWithdrawable;
        this.withdrawableAccounts = withdrawable;

    }


    public void processTransaction(){

        for (WithdrawableAccount acc: withdrawableAccounts){
            acc.deposite(1001.0);
            acc.withdraw(101.0);

        }

        for (NonWithdrawableAccount acc: nonWithdrawableAccounts){
            acc.deposite(1001.0);

        }
    }
}

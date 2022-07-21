public class BankingAppWithdrawalService{
    WithdrawableAccount account;
    public BankingAppWithdrawalService(WithdrawableAccount account){
        this.account = account;
    }
    public void withdraw(int amount){
        account.withdraw(amount);
    }
}

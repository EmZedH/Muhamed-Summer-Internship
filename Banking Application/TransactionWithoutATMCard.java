public class TransactionWithoutATMCard implements DepositableInterface {
    private Account account;
    TransactionWithoutATMCard(Account account){
        this.account=account;
    }
    @Override
    public void deposit(int amount){
        this.account.setBalance(this.account.getBalance()+amount);
    }
}

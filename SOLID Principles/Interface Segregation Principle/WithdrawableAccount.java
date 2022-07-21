public abstract class WithdrawableAccount extends Account {
    protected String name;
    protected int amount;
    protected int loanAmount;
    abstract void setName(String name);
    abstract void setAmount(int amount);
    abstract int getAmount();
    abstract String getName();
    abstract void deposit(int amount);
    abstract void withdraw(int amount);
    abstract int getLoanAmount();
    abstract void setLoanAmount(int loanAmount);

}

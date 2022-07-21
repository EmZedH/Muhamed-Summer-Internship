public abstract class WithdrawableAccount extends Account {
    protected String name;
    protected int amount;
    abstract void setName(String name);
    abstract void setAmount(int amount);
    abstract int getAmount();
    abstract String getName();
    abstract void deposit(int amount);
    abstract void withdraw(int amount);
}

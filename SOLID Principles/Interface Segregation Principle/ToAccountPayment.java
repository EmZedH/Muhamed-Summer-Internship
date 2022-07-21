public interface ToAccountPayment extends Payment{
    abstract void paymentToAccount(WithdrawableAccount accountOne,Account accountTwo,int amount);

}

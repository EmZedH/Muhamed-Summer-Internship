/*public interface Payment {
    void paymentToAccount(WithdrawableAccount accountOne,Account accountTwo);
    void paymentStatus();
    void getPaymentHistory(Account account);
    void accountLoanInfo(Account account);
    void initiateLoanSettlement(Account account);

}*/
public interface Payment {
    abstract void paymentStatus();
    abstract void getPaymentHistory(Account account);
}

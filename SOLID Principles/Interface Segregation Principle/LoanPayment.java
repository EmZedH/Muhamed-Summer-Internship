public interface LoanPayment extends Payment{
    abstract void accountLoanInfo(WithdrawableAccount account);
    abstract void initiateLoanRepayment(WithdrawableAccount account, int amount);
}

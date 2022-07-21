public class LoanPaymentFacility implements LoanPayment{
    public void paymentStatus(){
        System.out.println("Payment Successful!");
    }
    public void getPaymentHistory(Account account){
        System.out.println("Payment History List");
    }
    public void accountLoanInfo(WithdrawableAccount account){
        System.out.println("Account Loan Info");
        System.out.println("Amount = "+account.loanAmount);
    }
    public void initiateLoanRepayment(WithdrawableAccount account,int amount){
        System.out.println("Initiating Loan Repayment");
        account.withdraw(amount);
    }

}

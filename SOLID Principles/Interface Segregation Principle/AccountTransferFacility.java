public class AccountTransferFacility implements ToAccountPayment{
    public void paymentToAccount(WithdrawableAccount accountOne, Account accountTwo, int amount){
        accountOne.withdraw(amount);
        accountTwo.deposit(amount);
    }
    public void paymentStatus(){
        System.out.println("Payment Successful!");
    }
    public void getPaymentHistory(Account account){
        System.out.println("Payment History List");
    }

}

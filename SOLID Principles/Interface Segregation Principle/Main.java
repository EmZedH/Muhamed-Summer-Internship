public class Main {
    public static void main(String[] args) {
        Account muhamedAccount = new FixedDepositAccount();
        WithdrawableAccount hussainAccount = new SavingsAccount();

        hussainAccount.setName("Hussain");
        hussainAccount.setAmount(4000);

        muhamedAccount.setName("Muhamed");
        muhamedAccount.setAmount(7000);


        OutputPrintFacility printFacility = new OutputPrintFacility();

        printFacility.balanceInAccount(hussainAccount);
        printFacility.balanceInAccount(muhamedAccount);

        AccountTransferFacility payment = new AccountTransferFacility();

        payment.paymentToAccount(hussainAccount,muhamedAccount,3000);

        printFacility.balanceInAccount(hussainAccount);
        printFacility.balanceInAccount(muhamedAccount);

        hussainAccount.setLoanAmount(1000);

        printFacility.balanceInAccount(hussainAccount);



    }
}

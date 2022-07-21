public class Main {
    public static void main(String[] args) {
        Account muhamedAccount = new FixedDepositAccount();
        muhamedAccount.setName("Muhamed");
        muhamedAccount.setAmount(7000);
        System.out.println(muhamedAccount.getAmount());

        muhamedAccount.deposit(1000);

        System.out.println(muhamedAccount.getAmount());
    }
}

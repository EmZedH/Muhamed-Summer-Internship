public class TransactionWithATMCard implements DepositableInterface, WithdrawableInterface, SwipableInterface {
    private Account account;
    private static float transactChargeOne = 0.02f;
    private static float withdrawalLimit = 100f;
    public static float transactChargeTwo = 0.04f;
    public static float cashbackOffer = 0.01f;
    TransactionWithATMCard(Account account){
        this.account=account;
    }

    @Override
    public int withdraw(int amount){
        if(amount%5!=0){
            System.out.println("Please correct amount of value. Amount should be multiple of USD 5");
            System.out.println();
            return 1;
        }
        float remainingAmount;
        if(amount>withdrawalLimit){
            remainingAmount = this.account.getBalance()-amount-amount*transactChargeTwo;
        }
        else {
            remainingAmount = this.account.getBalance()-amount-amount*transactChargeOne;
        }
        if(remainingAmount>0){
            float charges = this.account.getBalance()-amount-remainingAmount;
            this.account.setBalance(remainingAmount);
            System.out.println("Charges: "+charges);
            System.out.println();
            return 2;
        }
        System.out.println("Insufficient balance for withdrawal.");
        System.out.println();
        return 0;
    }
    @Override
    public boolean swipeShopping(float amount){
        float remainingAmount = this.account.getBalance()-amount+amount*cashbackOffer;
        if(remainingAmount>0){
            float cashBack = remainingAmount-this.account.getBalance()+amount;
            System.out.println("Cashback: "+cashBack);
            System.out.println();
            this.account.setBalance(remainingAmount);
            return true;
        }
        System.out.println("Insufficient balance for card swipe.");
        System.out.println();
        return false;
    }
    public void deposit(int amount){
        this.account.setBalance(this.account.getBalance()+amount);
    }
}

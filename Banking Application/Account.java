public class Account {
    private int accountNumber;
    private String name;
    private float balance;
    private ATMCard atmCard=null;

    Account(int accountNumber, String name, float balance){
        this.accountNumber=accountNumber;
        this.name=name;
        this.balance=balance;
    }
    public void createATMCard(ATMCard atmCard){
        this.atmCard=atmCard;
    }
    public void setBalance(float balance){
        this.balance=balance;
    }
    public float getBalance(){
        return this.balance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getName() {
        return this.name;
    }

    public ATMCard getAtmCard() {
        return atmCard;
    }
}

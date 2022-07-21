public class FixedDepositAccount extends Account {
    void setName(String name){
        this.name=name;
    }
    void setAmount(int amount){
        this.amount = amount;
    }
    int getAmount(){
        return this.amount;
    }
    String getName(){
        return this.name;
    }
    void deposit(int amount){
        this.amount = this.amount+amount;
    }
}

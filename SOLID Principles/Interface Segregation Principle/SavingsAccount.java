public class SavingsAccount extends WithdrawableAccount {

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
    void withdraw(int amount){
        this.amount = this.amount-amount;
    }

    int getLoanAmount(){
        return this.loanAmount;
    }
    void setLoanAmount(int loanAmount){
        this.loanAmount=loanAmount;
    }
}

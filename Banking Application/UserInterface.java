import java.util.Scanner;

public class UserInterface {
    static float cardSwipeAmount= 150f;
    public static void printAccountDetails(Account account){
        System.out.println("-----------------------------");
        System.out.println("Account Details: ");
        System.out.println("-> Account Number: "+account.getAccountNumber());
        System.out.println("-> Name: "+account.getName());
        if(account.getAtmCard()!=null){
            System.out.println("-> Balance: "+account.getBalance());
            System.out.println("-> Card Number: "+account.getAtmCard().getCardNumber());
            System.out.println("-----------------------------");
        }
        else {
            System.out.println("-> Balance: "+account.getBalance());
            System.out.println("-----------------------------");
        }
        System.out.println();
        if(account.getAtmCard()==null){
            printFirstOptions(account);
        }
        else {
            printOptionsForCard(account);

        }
    }

    public static void printFirstOptions(Account account){
        if(account.getBalance()>100){
            System.out.println("1. Deposit amount");
            System.out.println("2. Apply for ATM Card");
        }
        else {
            System.out.println("1. Deposit amount");
        }
        Scanner scanner=new Scanner(System.in);
        int input = scanner.nextInt();
        firstUserInput(input,account);

    }
    public static void printOptionsForCard(Account account){
        System.out.println("1. Deposit amount");
        System.out.println("2. ATM Withdraw");
        System.out.println("3. Card Swipe "+cardSwipeAmount);
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        consequentUserInput(input,account);
    }

    public static void firstUserInput(int input,Account account){
        switch (input){
            case 0:
                System.out.println("Exiting Application...");
                System.exit(0);
                break;
            case 1:
                System.out.println("Deposit amount: ");
                System.out.print("Enter amount to deposit: ");
                Scanner scanner = new Scanner(System.in);
                int amount = scanner.nextInt();
                DepositableInterface transactionInterface = new TransactionWithoutATMCard(account);
                transactionInterface.deposit(amount);
                System.out.println();
                printAccountDetails(account);
                break;
            case 2:
                if(account.getBalance()<100){
                    System.out.println("Wrong Input...");
                    printFirstOptions(account);
                }
                else {
                    System.out.println();
                    System.out.println("-----------------------------");
                    System.out.println("Applying for card...");
                    account.createATMCard(new ATMCard(111111+account.getAccountNumber()));
                    System.out.println("Card profile created...");
                    System.out.println("-----------------------------");
                    System.out.println();
                    printAccountDetails(account);
                }
                break;
            default:
                System.out.println("Wrong Input");
                printFirstOptions(account);

        }
    }

    public static void consequentUserInput(int input, Account account) {
        TransactionWithATMCard transaction = new TransactionWithATMCard(account);
        Scanner scanner = new Scanner(System.in);
        switch (input){
            case 0:
                System.out.println("Exiting Application...");
                System.exit(0);
                break;
            case 1:
                System.out.println("Deposit amount: ");
                System.out.print("Enter amount to deposit: ");
                int amount = scanner.nextInt();
                DepositableInterface transactionInterface = new TransactionWithATMCard(account);
                transactionInterface.deposit(amount);
                System.out.println();
                printAccountDetails(account);
                break;
            case 3:
                System.out.println("-----------------------------");
                System.out.println("Card Swipe: ");
                boolean returnValue = transaction.swipeShopping(cardSwipeAmount);
                if(!returnValue){
                    System.out.println("Card Swipe failed!");
                }
                System.out.println("-----------------------------");
                printAccountDetails(account);
                break;
            case 2:
                System.out.println("Withdraw: ");
                System.out.println("Please enter amount to withdraw from ATM: ");
                int returnValue2 = transaction.withdraw(scanner.nextInt());
                if(returnValue2==0){
                    System.out.println("ATM Withdrawal Failed!");
                    printAccountDetails(account);
                }
                else if(returnValue2==1){
                    consequentUserInput(2,account);
                }
                printOptionsForCard(account);
                break;
            default:
                System.out.println("Wrong Input");
                printOptionsForCard(account);

        }
    }
}

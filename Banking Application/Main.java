import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Give account number: ");
        Scanner scannerNumber = new Scanner(System.in);
        int input = scannerNumber.nextInt();

        System.out.println("Give name: ");
        Scanner scannerName = new Scanner(System.in);
        String name = scannerName.nextLine();

        System.out.println("Give balance: ");
        Scanner scannerBalance = new Scanner(System.in);
        float balance = scannerBalance.nextFloat();

        Account account = new Account(input, name,balance);
        UserInterface.printAccountDetails(account);
    }
}

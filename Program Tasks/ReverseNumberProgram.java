import java.util.Scanner;
public class ReverseNumberProgram {
    public static void main(String[] args){
        int intInput;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number: ");

        intInput = scan.nextInt();

        int reverseNumber = 0;

        while(intInput != 0){
            int x = intInput % 10;
            reverseNumber = reverseNumber * 10 + x;
            intInput = intInput /10;
        }

        System.out.println("The reverse number is: ");

        System.out.println(reverseNumber);
    }
}
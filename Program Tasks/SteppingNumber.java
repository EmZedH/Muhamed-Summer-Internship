import java.util.Scanner;
public class SteppingNumber {

    public static boolean checkSteppingNumber(int numberToCheck){
        if(numberToCheck<10)
            return true;
        int firstDigit = numberToCheck%10;
        int lastDigit,x;
        while(numberToCheck/10 !=0){
            x = (numberToCheck)%10 - (numberToCheck/10)%10;
            if(!(x==1 || x==-1))
                return false;
            numberToCheck/=10;
        }
        lastDigit = numberToCheck;
        x=firstDigit-lastDigit;
        if(x==1 || x==-1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int firstNumber,secondNumber,i;
        boolean flag=false;

        System.out.println("Enter the first number: ");
        Scanner scan = new Scanner(System.in);
        firstNumber = scan.nextInt();

        System.out.println("Enter the second number: ");
        scan = new Scanner(System.in);
        secondNumber = scan.nextInt();

        for(i=firstNumber;i<=secondNumber;i++){
            if(checkSteppingNumber(i)){
                flag=true;
                System.out.print(i+",");
            }

        }
        if(!flag)
            System.out.println("No stepping numbers");
    }
}

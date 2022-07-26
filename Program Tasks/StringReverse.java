import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        String inputString;
        String outputString="";
        char c;
        Scanner scan = new Scanner(System.in);
        inputString = scan.nextLine();

        for (int i = inputString.length()-1;i>=0;i--){
            c=inputString.charAt(i);
            outputString=outputString+c;

        }
        System.out.println(outputString);

    }
}

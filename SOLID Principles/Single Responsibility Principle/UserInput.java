import java.util.Scanner;

public class UserInput {
    static int choiceInput(){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        return i-1;
    }
}

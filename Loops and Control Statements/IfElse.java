import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        int[] a= new int[3];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<3;i++){
            a[i]=in.nextInt();
        }
        if((a[0]<=a[1] && a[0]>=a[2])||(a[0]<=a[2] && a[0]>=a[1])){
            System.out.println("Second largest number is "+a[0]);
        }
        else if((a[1]<=a[0] && a[1]>=a[2])||(a[1]<=a[2] && a[1]>=a[0])){
            System.out.println("Second largest number is "+a[1]);
        }
        else{
            System.out.printf("Second largest number is "+a[2]);
        }


    }
}

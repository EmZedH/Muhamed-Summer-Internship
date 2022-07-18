import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        int[] array= new int[3];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<3;i++){
            array[i]=in.nextInt();
        }
        if((array[0]<=array[1] && array[0]>=array[2])||(array[0]<=array[2] && array[0]>=array[1])){
            System.out.println("Second largest number is "+array[0]);
        }
        else if((array[1]<=array[0] && array[1]>=array[2])||(array[1]<=array[2] && array[1]>=array[0])){
            System.out.println("Second largest number is "+array[1]);
        }
        else{
            System.out.printf("Second largest number is "+array[2]);
        }


    }
}

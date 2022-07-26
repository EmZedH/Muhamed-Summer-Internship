import java.util.Scanner;

public class TrapSequence {

    public static int digitSum(int number){
        int sum=0;
        while (number>0){
            sum+=number%10;
            number/=10;
        }
        return sum;
    }

    public static boolean checkTrap(int x, int y){
        if(x==y || x%y==0 || y%x==0)
            return true;
        int z=x;
        if(z>9){
            while (z>9){
                z=digitSum(z);
            }
            return checkTrap(z,y);
        }
        return false;
    }
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of N1: ");
        int n1 = scanner.nextInt();

        scanner = new Scanner(System.in);
        System.out.println("Enter value of N2: ");
        int n2 = scanner.nextInt();

        scanner =new Scanner(System.in);
        System.out.println("Enter value of y: ");
        int y = scanner.nextInt();

        for (int i=n1;i<=n2;i++){
            if (checkTrap(i,y)) {
                System.out.print(i+" ");
                y+=2;
            }else if(!checkTrap(i,y)){
                y--;
                if(y<3)
                    y=3;
            }

        }



    }
}

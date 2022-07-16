import java.lang.reflect.Array;

public class ExceptionHandling {
    public static void main(String[] args){
        int[] a={3,0};
        try{
            int z = a[0]/a[2];
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero undefined");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Size Exceeded");
        }

        System.out.println("If Exception Handled, this will be printed...");

    }
}

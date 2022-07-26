import java.util.*;

public class KthLargestSmallest {
    public static void main(String[] args) {

        int[] inputArray={-1,-3,-5,-10,-3,-3,0};
        int[] outputArray = inputArray;
        int temp;

        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();

        for (int i=0;i< inputArray.length;i++){
            for (int j=i+1;j< inputArray.length;j++){
                if(inputArray[i] > inputArray[j]){
                    temp=inputArray[i];
                    inputArray[i]=inputArray[j];
                    inputArray[j]=temp;

                }
            }
        }


        System.out.print("Sorted array: ");
        for (int i=0;i<inputArray.length;i++){
            System.out.print(inputArray[i]+" ");        //view sorted array
        }
        System.out.println();
        System.out.println(k+"th smallest number is "+inputArray[k-1]);
        System.out.println(k+"th largest number is "+inputArray[inputArray.length-k]);
    }
}

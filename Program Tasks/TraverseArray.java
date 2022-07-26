import java.util.*;

public class TraverseArray {

    public static int maxNumber(int[] array){
        int maxNumber=array[0];
        for (int i=1;i<array.length;i++){
            if(maxNumber<array[i]){
                maxNumber=array[i];
            }
        }
        return maxNumber;
    }

    public static int outputGenerator(int[] array, int j){
        int number = array[j],
                maxNumber=maxNumber(array)+1,
                k=0;

        while(number!=maxNumber){
            number++;

            for (int i=j;i<array.length;i++){
                if(array[i]==number){
                    return number;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[]= {2, -1, 0, -1, 3};
        int[] outputArray = array;

        for (int i=0;i< array.length;i++){

            outputArray[i]= outputGenerator(array,i);

        }
        System.out.println(Arrays.toString(outputArray));
    }
}

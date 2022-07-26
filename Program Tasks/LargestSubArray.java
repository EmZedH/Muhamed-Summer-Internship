public class LargestSubArray {

    public static void main(String[] args) {
        int inputArray[] = {1, 0, 1, 1, 1, 0, 0};
        int i=0,j,ones=0,zeroes=0;
        int flagEnd =0, flagBeginning =0;

        while (i<inputArray.length){

            for (j=i;j<inputArray.length;j++){
                if(inputArray[j]==1)
                    ones++;
                else if(inputArray[j]==0)
                    zeroes++;

                if(ones==zeroes && (flagEnd-flagBeginning)<j-i+1){
                    flagBeginning=i;
                    flagEnd = j;
                }

            }
            ones=0;zeroes=0;
            i++;
        }

        System.out.println(flagBeginning +" "+ flagEnd);

    }
}

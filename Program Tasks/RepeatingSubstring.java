import java.util.*;

public class RepeatingSubstring {


    public static void main(String[] args) {
        String[] stringsPreFilter = new String[15];

        int wordsize = 4;

        String inputString = "However Everyday is a Day";
        String[] tokenizedStrings = new String[10];


        int i,j,k=0;


        //word tokenizer
        tokenizedStrings[0]="";

        inputString=inputString.toLowerCase();

        for (i=0;i<inputString.length();i++){
            if(inputString.charAt(i)==' '){
                k++;
                tokenizedStrings[k]="";
                continue;
            }
            tokenizedStrings[k]= tokenizedStrings[k]+inputString.charAt(i);
        }

        int lengthOfTokenizedString = k;

        k=0;

        //repeating subset finder (minimum string size 2)
        for(i=0;i<inputString.length();i++){

            for (j=i+2;j<=inputString.length();j++){

                if(inputString.substring(j,inputString.length()).contains(inputString.substring(i,j))){
                    stringsPreFilter[k]=inputString.substring(i,j);
                    k++;
                }

            }

        }

        int lengthOfPreFilter = k;
        String[] finalStrings = new String[15];

        //only allows words of size>4 or those that already exists as separate words in given sentence
        k=0;
        for (i=0;i<lengthOfPreFilter;i++){
            if(stringsPreFilter[i].length()>=wordsize){
                finalStrings[k]=stringsPreFilter[i];
                k++;
            }
            else{
                for (j=0;j<=lengthOfTokenizedString;j++){
                    if(stringsPreFilter[i].length()<wordsize && stringsPreFilter[i].equals(tokenizedStrings[j])){
                        finalStrings[k]=stringsPreFilter[i];
                        k++;
                    }
                }
            }
        }
        int lengthOfFinalStrings=k;

        //print final array
        for(i=0;i<lengthOfFinalStrings;i++){
            System.out.print(finalStrings[i]+" ");
        }

    }
}

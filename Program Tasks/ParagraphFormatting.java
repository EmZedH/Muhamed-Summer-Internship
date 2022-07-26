import java.util.*;

public class ParagraphFormatting {

    static int lineSize = 22;
    static ArrayList<ArrayList<String>> wordsGrouping(String[] inputString){
        ArrayList<ArrayList<String>> returnArray = new ArrayList<>();
        int length = 0;
        ArrayList<String> placeholder = new ArrayList<>();
        for (String m:inputString){
            length+=m.length()+1;
            if(length>lineSize){
                length-=1;
            }
            if(length>lineSize){
                returnArray.add(new ArrayList<>(placeholder));
                placeholder.clear();
                placeholder.add(m);
                length=0;
                length+=m.length()+1;
            }
            else {
                placeholder.add(m);
            }
        }
        returnArray.add(new ArrayList<>(placeholder));
        return returnArray;
    }
    static ArrayList<Integer> whiteSpaceCounter(ArrayList<ArrayList<String>> inputArray){
        ArrayList<Integer> whiteSpaces = new ArrayList<>();
        int size;
        for (ArrayList<String> s:inputArray){
            size=0;
            for (String m:s){
                size+=m.length();
            }
            whiteSpaces.add(lineSize - size);
        }
        return whiteSpaces;
    }


static ArrayList<String> spaceAdder(ArrayList<ArrayList<String>> groupedStrings, ArrayList<Integer> whitespaceArray){
        ArrayList<String> finalArray = new ArrayList<>();
        int index=0;
        for(ArrayList<String> m:groupedStrings){
            int whitespace = whitespaceArray.get(index);
            while(whitespace>0){                                            //adds the whitespace to strings in separateWords
                if(m.size()==1){
                    m.set(0, m.get(0) + " ");
                    whitespace--;
                }
                for (int i=0;i<m.size()-1;i++){
                    if(whitespace>0) {
                        m.set(i, m.get(i) + " ");
                        whitespace--;
                    }
                }
                if(whitespace==0){
                    String add="";
                    for (String n:m){
                        add = add+n;
                    }
                    finalArray.add(add);
                    break;
                }
            }
            index++;
        }
        return finalArray;
}


    public static void printLineByLine(ArrayList<String> inputArray){
        for (String m: inputArray){
            System.out.println(m);
        }
    }




    public static void main(String[] args) {

        String[] strings = new String[]{"This", "is", "an", "example", "of", "text", "justification."};

        String[] inputString = new String[]{"To","access","the","data","To","access","the","To","access","the","data","To","access","the","To","access","the","data","To","access","the","data","members","of","parent","class","when","both","parent","To","access","the","data","members","of","parent","class","when","both","parent","and","child","class","have","member","with","same","name"};/*"Hello!", "How", "are", "you.", "Im", "fine", "Thank", "You", "How", "do", "you", "Do?"*/



        printLineByLine(spaceAdder(wordsGrouping(inputString),whiteSpaceCounter(wordsGrouping(inputString))));




    }
}

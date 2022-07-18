import java.util.*;

public class ArrayListProgram {
    public static void main(String[] args){
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(9);
        Iterator<Integer> it = arraylist.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

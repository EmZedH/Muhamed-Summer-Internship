import java.util.*;

public class ArrayListProgram {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(9);
        Iterator<Integer> it = arrayList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

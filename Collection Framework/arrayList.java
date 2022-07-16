import java.util.*;

public class arrayList {
    public static void main(String[] args){
        ArrayList<Integer> m = new ArrayList<Integer>();
        m.add(1);
        m.add(2);
        m.add(9);
        Iterator<Integer> it = m.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

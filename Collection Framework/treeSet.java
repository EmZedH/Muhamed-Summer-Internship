import java.util.*;

public class treeSet {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(5);
        t.add(0);
        t.add(3);
        t.add(0);
        t.add(9);
        t.remove(3);
        Iterator<Integer> it= t.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

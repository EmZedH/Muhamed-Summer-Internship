import java.util.*;

public class linkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> l = new LinkedHashSet<>();
        l.add(1);
        l.add(9);
        l.add(6);
        l.add(5);
        l.add(1);
        l.remove(9);
        Iterator<Integer> it = l.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

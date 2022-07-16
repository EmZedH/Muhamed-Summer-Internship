import java.util.*;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        h.add(0);
        h.add(9);
        h.add(3);
        h.add(11);
        h.add(3);
        Iterator<Integer> it = h.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

import java.util.*;
public class arraydeque {
    public static void main(String[] args) {
        Deque<Integer> d= new ArrayDeque<Integer>();
        d.add(1);
        d.add(3);
        d.add(5);
        d.add(7);
        d.addFirst(1);
        d.removeLast();
        Iterator<Integer> it = d.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

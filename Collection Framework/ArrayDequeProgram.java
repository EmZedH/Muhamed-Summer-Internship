import java.util.*;
public class ArrayDequeProgram {
    public static void main(String[] args) {
        Deque<Integer> deque= new ArrayDeque<Integer>();
        deque.add(1);
        deque.add(3);
        deque.add(5);
        deque.add(7);
        deque.addFirst(1);
        deque.removeLast();
        Iterator<Integer> it = deque.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

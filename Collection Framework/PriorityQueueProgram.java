import java.util.*;

public class PriorityQueueProgram {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(7);
        queue.add(3);
        queue.add(10);
        queue.add(7);
        queue.remove();
        Iterator<Integer> it = queue.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

import java.util.*;

public class priorityqueue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(7);
        q.add(3);
        q.add(10);
        q.add(7);
        q.remove();
        Iterator<Integer> it = q.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

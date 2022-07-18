import java.util.*;
public class LinkedListProgram {
    public static void main(String[] args) {
        LinkedList<Integer> linklist= new LinkedList<Integer>();
        linklist.add(5);
        linklist.add(6);
        linklist.add(7);
        linklist.add(5);
        Iterator<Integer> it = linklist.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

import java.util.*;
public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> n= new LinkedList<Integer>();
        n.add(5);
        n.add(6);
        n.add(7);
        n.add(5);
        Iterator<Integer> it = n.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

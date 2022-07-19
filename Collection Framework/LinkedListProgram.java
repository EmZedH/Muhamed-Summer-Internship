import java.util.*;
public class LinkedListProgram {
    public static void main(String[] args) {
        LinkedList<Integer> linkList= new LinkedList<Integer>();
        linkList.add(5);
        linkList.add(6);
        linkList.add(7);
        linkList.add(5);
        Iterator<Integer> it = linkList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

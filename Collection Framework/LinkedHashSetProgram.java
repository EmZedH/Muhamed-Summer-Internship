import java.util.*;

public class LinkedHashSetProgram {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkHash = new LinkedHashSet<>();
        linkHash.add(1);
        linkHash.add(9);
        linkHash.add(6);
        linkHash.add(5);
        linkHash.add(1);
        linkHash.remove(9);
        Iterator<Integer> it = linkHash.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

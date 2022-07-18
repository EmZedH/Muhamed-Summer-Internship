import java.util.*;

public class LinkedHashSetProgram {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkhash = new LinkedHashSet<>();
        linkhash.add(1);
        linkhash.add(9);
        linkhash.add(6);
        linkhash.add(5);
        linkhash.add(1);
        linkhash.remove(9);
        Iterator<Integer> it = linkhash.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

import java.util.*;

public class HashSetProgram {
    public static void main(String[] args) {
        HashSet<Integer> hashset = new HashSet<>();
        hashset.add(0);
        hashset.add(9);
        hashset.add(3);
        hashset.add(11);
        hashset.add(3);
        Iterator<Integer> it = hashset.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

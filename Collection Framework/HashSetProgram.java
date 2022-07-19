import java.util.*;

public class HashSetProgram {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(0);
        hashSet.add(9);
        hashSet.add(3);
        hashSet.add(11);
        hashSet.add(3);
        Iterator<Integer> it = hashSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

import java.util.*;

public class vector {
    public static void main(String[] args) {
        Vector<Integer> z = new Vector<>();
        z.add(3);
        z.add(7);
        z.add(9);
        z.add(3);
        z.remove(3);
        Iterator<Integer> it = z.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

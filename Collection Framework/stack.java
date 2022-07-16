import java.util.*;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> i = new Stack<Integer>();
        i.push(1);
        i.push(7);
        i.push(3);
        i.push(1);
        i.pop();
        i.pop();
        Iterator<Integer> it = i.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

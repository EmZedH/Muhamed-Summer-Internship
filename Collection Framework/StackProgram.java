import java.util.*;

public class StackProgram {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(7);
        stack.push(3);
        stack.push(1);
        stack.pop();
        stack.pop();
        Iterator<Integer> it = stack.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

import java.util.*;
public class HashMapProgram {
    public static void main(String[] args) {
        HashMap<Integer,String> hashmap = new HashMap<Integer,String>();
        hashmap.put(1,"Hello");
        hashmap.put(3,"How");
        hashmap.put(5,"Are");
        hashmap.put(6,"You");
        for(HashMap.Entry im: hashmap.entrySet()){
            System.out.println(im.getKey()+" "+im.getValue());
        }



    }
}

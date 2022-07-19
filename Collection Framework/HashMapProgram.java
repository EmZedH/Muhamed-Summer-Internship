import java.util.*;
public class HashMapProgram {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        hashMap.put(1,"Hello");
        hashMap.put(3,"How");
        hashMap.put(5,"Are");
        hashMap.put(6,"You");
        for(HashMap.Entry im: hashMap.entrySet()){
            System.out.println(im.getKey()+" "+im.getValue());
        }



    }
}

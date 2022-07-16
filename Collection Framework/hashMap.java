import java.util.*;
public class hashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"Hello");
        hm.put(3,"How");
        hm.put(5,"Are");
        hm.put(6,"You");
        for(HashMap.Entry im: hm.entrySet()){
            System.out.println(im.getKey()+" "+im.getValue());
        }



    }
}

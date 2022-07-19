public class StringPool {
    public static void main(String[] args) {
        String str1 = "hello";                             //creates in string pool
        String str2 = new String("hello");                 //creates in heap memory
        String str3 = new String("hello").intern();        //shifts to string pool
        System.out.println(str1==str2);                    //false
        System.out.println(str1==str3);                    //true
    }
}

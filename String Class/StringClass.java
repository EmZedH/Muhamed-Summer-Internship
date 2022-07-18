public class StringClass {
    public static void main(String[] args){
        String str1 = " Hi Muhamed ";
        String str2 = new String("How are u?");
        System.out.println(str1);
        System.out.println(str1.length());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.concat(str2));
        System.out.println(str1.trim());
        System.out.println(str1.replace('H','J'));
        System.out.println(str1.substring(5));
        System.out.println(str1.substring(5,8));
        System.out.println(str1.charAt(5));
    }
}

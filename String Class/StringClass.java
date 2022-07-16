public class StringClass {
    public static void main(String[] args){
        String s = " Hi Muhamed ";
        String m = new String("How are u?");
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.concat(m));
        System.out.println(s.trim());
        System.out.println(s.replace('H','J'));
        System.out.println(s.substring(5));
        System.out.println(s.substring(5,8));
        System.out.println(s.charAt(5));
    }
}

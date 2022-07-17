public class garbagecollector {
    public void finalize(){
        System.out.println("Garbage Collection Done");
    }
    public static void main(String[] args) {
        garbagecollector h = new garbagecollector();
        garbagecollector n = new garbagecollector();
        System.out.println(h);
        System.out.println(n);
        h = null;
        //System.out.println(n.x);
        System.gc();
        System.out.println(h);


    }
}

public class GarbageCollector {
    public void finalize(){
        System.out.println("Garbage Collection Done");
    }
    public static void main(String[] args) {
        GarbageCollector gc1 = new GarbageCollector();
        GarbageCollector gc2 = new GarbageCollector();
        System.out.println(gc1);
        System.out.println(gc2);
        gc1 = null;
        System.gc();
        System.out.println(gc1);


    }
}

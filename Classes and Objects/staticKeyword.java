class simply{
    static int x = 2;
    static void increment(){
        x++;
    }
}

public class staticKeyword{
    public static void main(String[] args) {
        simply s = new simply();
        System.out.println("s.x = "+s.x);
        s.x=4;
        simply y = new simply();
        System.out.println("y.x after changing s.x to 4 = "+y.x);
        s.increment();
        simply z = new simply();
        System.out.println("z.x after s.increment() is invoked = "+z.x);
    }
}

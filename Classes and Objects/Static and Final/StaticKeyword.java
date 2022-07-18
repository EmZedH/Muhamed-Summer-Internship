class StaticKeywordClass{
    static int x = 2;
    static void increment(){
        x++;
    }
}

public class StaticKeyword{
    public static void main(String[] args) {
        StaticKeywordClass statkey = new StaticKeywordClass();
        System.out.println("s.x = "+s.x);
        statkey.x=4;
        StaticKeywordClass y = new StaticKeywordClass();
        System.out.println("y.x after changing s.x to 4 = "+y.x);
        statkey.increment();
        StaticKeywordClass z = new StaticKeywordClass();
        System.out.println("z.x after s.increment() is invoked = "+z.x);
    }
}

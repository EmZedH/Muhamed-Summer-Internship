class timply{
    final int x=2;
}


public class finalkeyword {
    public static void main(String[] args) {
        timply t = new timply();
        t.x=3;//produces error
        System.out.println(t.x);
    }
}

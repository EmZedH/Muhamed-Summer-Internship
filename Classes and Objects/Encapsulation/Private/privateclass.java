class pClass{
    private int x=110;
    void xvalue(){
        System.out.println(x);
    }
}

public class privateclass {
    public static void main(String[] args) {
        pClass pc = new pClass();
        pc.xvalue();

    }
}

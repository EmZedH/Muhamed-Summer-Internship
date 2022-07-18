package pack2;

public class classY {
    public static void main(String[] args) {
        pack1.classX x = new pack1.classX();
        System.out.println("Value of y in classX = "+x.y);
        System.out.println("Value of z in classX = "+x.z);
        x.xfunc();

    }
}

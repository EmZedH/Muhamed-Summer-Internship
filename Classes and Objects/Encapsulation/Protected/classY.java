package pack2;
import pack1.*;
public class classY extends classX {
    public static void main(String[] args) {
        classY x = new classY();
        System.out.println("Value of y in classX = "+x.y);
        System.out.println("Value of z in classX = "+x.z);
        x.xfunc();

    }
}

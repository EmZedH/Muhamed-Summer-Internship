class class1{
    int x = 4;
}
class class2 extends class1{
    int y=5;
}
public class inheritance {
    public static void main(String[] args) {
        class2 z = new class2();
        System.out.println("z.x="+z.x);
        System.out.println("z.y="+z.y);
    }
}

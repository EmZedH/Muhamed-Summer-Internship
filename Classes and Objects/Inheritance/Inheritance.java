class ClassOne{
    int x = 4;
}
class ClassTwo extends ClassOne{
    int y=5;
}
public class Inheritance {
    public static void main(String[] args) {
        ClassTwo var = new ClassTwo();
        System.out.println("var.x="+var.x);
        System.out.println("var.y="+var.y);
    }
}

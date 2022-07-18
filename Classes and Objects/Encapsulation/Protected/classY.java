package PackageTwo;
import PackageOne.*;
public class ClassTwo extends ClassOne {
    public static void main(String[] args) {
        ClassTwo obj = new ClassTwo();
        System.out.println("Value of y in ClassOne = "+obj.y);
        System.out.println("Value of z in ClassOne = "+obj.z);
        obj.printFunction();

    }
}

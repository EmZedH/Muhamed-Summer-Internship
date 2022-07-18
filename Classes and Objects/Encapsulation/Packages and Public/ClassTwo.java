package PackageTwo;

public class ClassTwo {
    public static void main(String[] args) {
        PackageOne.classOne obj = new PackageOne.classOne();
        System.out.println("Value of y in classOne = "+obj.y);
        System.out.println("Value of z in classOne = "+obj.z);
        obj.function();

    }
}

class ProgramClass{
    int z;
    void product(int x, int y){
        z=x*y;
    }
    void product(int x, int y, int z){
        z=x*y*z;
    }
    double product(double x,double y){
        return x*y;
    }
}
public class Overloading {
    public static void main(String[] args) {
        ProgramClass pgclass = new ProgramClass();
        pgclass.product(2,3);
        System.out.println("first product() = "+pgclass.z);
        c.product(2,3,4);
        System.out.println("second product() = "+pgclass.z);
        System.out.println("third product() = "+pgclass.product(3.0,5.3));

    }
}

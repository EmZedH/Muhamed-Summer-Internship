class olclass{
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
public class overloading {
    public static void main(String[] args) {
        olclass c = new olclass();
        c.product(2,3);
        System.out.println("first product() = "+c.z);
        c.product(2,3,4);
        System.out.println("second product() = "+c.z);
        System.out.println("third product() = "+c.product(3.0,5.3));

    }
}

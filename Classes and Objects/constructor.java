class ccl{
    int a;
    int b;
    ccl(int a,int b){
        this.a=a;
        this.b=b;
    }
}

public class constructor {
    public static void main(String[] args) {
        ccl cc = new ccl(1,2);
        System.out.println("After invoking object through constructor, values are:");
        System.out.println("cc.a="+cc.a);
        System.out.println("cc.b="+cc.b);
    }
}

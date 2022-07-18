class ConstructorClass{
    int a;
    int b;
    ConstructorClass(int a,int b){
        this.a=a;
        this.b=b;
    }
}

public class ConstructorProgram {
    public static void main(String[] args) {
        ConstructorClass constclass = new ConstructorClass(1,2);
        System.out.println("After invoking object through constructor, values are:");
        System.out.println("constclass.a="+constclass.a);
        System.out.println("constclass.b="+constclass.b);
    }
}

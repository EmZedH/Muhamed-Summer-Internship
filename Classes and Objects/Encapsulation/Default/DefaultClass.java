public class ClassOne {
    int x=2;
    int y=5;
    int z=x+y;
}
class DefaultClass{
    public static void main(String[] args){
        ClassOne obj = new ClassOne();
        obj.x=5;
        System.out.println("Sum of "+obj.x+" and "+obj.y+" is "+obj.z);
    }
}

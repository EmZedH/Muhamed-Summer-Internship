public class defaultClass {
    int x=2;
    int y=5;
    int z=x+y;
}
class Lala{
    public static void main(String[] args){
        ClassObject object = new ClassObject();
        object.x=5;
        System.out.println("Sum of "+object.x+" and "+object.y+" is "+object.z);
    }
}

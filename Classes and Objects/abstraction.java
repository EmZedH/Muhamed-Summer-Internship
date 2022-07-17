abstract class abclass1{
    int x=8;
    abstract void abfunc();

}
class abclass2 extends abclass1{
    void abfunc(){
        System.out.println(x);
    }
}
public class abstraction {
    public static void main(String[] args) {
        abclass2 abc = new abclass2();
        abc.abfunc();

    }
}

abstract class AbstractionClass1{
    int x=8;
    abstract void abFunction();

}
class AbstractionClass2 extends AbstractionClass1{
    void abFunction(){
        System.out.println(x);
    }
}
public class AbstractionProgram {
    public static void main(String[] args) {
        AbstractionClass2 var = new AbstractionClass2();
        var.abFunction();

    }
}

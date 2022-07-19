interface Runnable{
    void print();
}
class FirstClass implements Runnable{
    public void print(){
        System.out.println("Successfully implemented from interface");
    };
}
public class InterfaceProgram {
    public static void main(String[] args) {
        firstclass classvar = new firstclass();
        classvar.print();
    }
}

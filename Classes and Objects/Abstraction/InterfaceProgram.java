interface FirstInterface{
    void print();
}
class FirstClass implements FirstInterface{
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

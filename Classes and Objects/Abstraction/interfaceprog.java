interface firstinter{
    void print();
}
class firstclass implements firstinter{
    public void print(){
        System.out.println("Successfully implemented from interface");
    };
}
public class interfaceprog {
    public static void main(String[] args) {
        firstclass c = new firstclass();
        c.print();
    }
}

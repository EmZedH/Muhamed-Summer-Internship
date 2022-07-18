class PrivateClass{
    private int x=110;
    void getX(){
        System.out.println(x);
    }
}

public class PrivateClass {
    public static void main(String[] args) {
        PrivateClass obj = new PrivateClass();
        obj.getX();

    }
}

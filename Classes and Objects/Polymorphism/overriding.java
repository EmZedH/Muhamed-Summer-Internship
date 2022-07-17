class ovrclass1{
    void func(){
        System.out.println("From 1st class - ovrclass1");
    }
}
class ovrclass2{
    String func(){
        return "From 2nd class - ovrclass2";
    }
}

public class overriding {
    public static void main(String[] args) {
        ovrclass1 ob = new ovrclass1();
        ovrclass2 oc = new ovrclass2();
        ob.func();
        System.out.println(oc.func());

    }
}

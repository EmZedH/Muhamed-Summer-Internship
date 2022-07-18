class ClassOne{
    void func(){
        System.out.println("From 1st class - ovrclass1");
    }
}
class ClassTwo extends ClassOne{
    String func(){
        return "From 2nd class - ovrclass2";
    }
}

public class Overriding {
    public static void main(String[] args) {
        ClassOne obj1 = new ClassOne();
        ClassTwo obj2 = new ClassTwo();
        obj1.func();
        System.out.println(obj2.func());

    }
}

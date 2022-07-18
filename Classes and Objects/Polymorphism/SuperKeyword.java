class ClassOne {
    int x = 4;
}
class ClassTwo extends ClassOne{
    void increment(){
        super.x++;
    }
    void addFour(){
        super.x=super.x+4;
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        ClassTwo obj = new ClassTwo();
        System.out.println("Initial value of x = "+obj.x);
        obj.incr();
        System.out.println("Value of x after increment = "+obj.x);
        obj.addfour();
        System.out.println("value of x after adding with 4 = "+obj.x);
    }
}

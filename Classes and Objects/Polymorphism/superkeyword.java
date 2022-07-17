class spclass1 {
    int x = 4;
}
class spclass2 extends spclass1{
    void incr(){
        super.x++;
    }
    void addfour(){
        super.x=super.x+4;
    }
}
public class superkeyword {
    public static void main(String[] args) {
        spclass2 sp = new spclass2();
        System.out.println("Initial value of x = "+sp.x);
        sp.incr();
        System.out.println("Value of x after increment = "+sp.x);
        sp.addfour();
        System.out.println("value of x after adding with 4 = "+sp.x);
    }
}

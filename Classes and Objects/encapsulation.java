class Number{
    private int num;
    public int getNum(){
        return num;
    }
    public void setNum(int x){
        num=x;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Number number = new Number();
        number.setNum(2);
        System.out.println("Setter sets num = 2");
        System.out.println("Getter gets value = "+number.getNum());
        number.setNum(6);
        System.out.println("Setter sets num = 6");
        System.out.println("Getter gets value = "+number.getNum());
    }
}

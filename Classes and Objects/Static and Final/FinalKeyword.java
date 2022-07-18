class FinalKeyClass{
    final int x=2;
}


public class FinalKeyword {
    public static void main(String[] args) {
        FinalKeyClass y = new FinalKeyClass();
        y.x=3;//produces error
        System.out.println(y.x);
    }
}

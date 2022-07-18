public class UserDefinedException extends Exception{
    public static void main(String[] args) {
        try{
            throw new Exception("My exception");

        }
        catch (Exception my){
            System.out.println("Exception Caught");
            System.out.println(my.getMessage());
        }

    }
}


public class Main {

    public static void main(String[] args) {
        int number=8,pos=-1;
        int[] a = {10,5,2,3,7};
        for(int i=0;i<a.length;i++){
            if(a[i]==number){
                pos=i;
                break;
            }
        }
        if(pos==-1)
            System.out.println("Number not in array");
        else
            System.out.println("Number in position "+(pos+1));
    }
}

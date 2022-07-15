public class Second {

    public static void main(String[] args) {
        int[] a={1,5,7};
        int maxno=a[0],maxno2=a[0];
        for(int i=1;i<a.length;i++){
            if(maxno<a[i]){
                maxno=a[i];
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]==maxno){
                continue;
            }
            if(maxno2<a[i]){
                maxno2=a[i];
            }
        }
        System.out.println("Second Maximum number is = "+maxno2);

    }
}

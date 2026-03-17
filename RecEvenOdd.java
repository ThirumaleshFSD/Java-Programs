public class RecEvenOdd {
    public static int rec(int a[],int l){
        if(l==a.length){
            return 0;
        }
        if(a[l]%2==0){
          System.out.println("even :"+" "+ a[l]);
          
        }
        else{
            System.out.println("odd :"+" "+ a[l]);


        }
        return rec(a,l+1);
    }

    public static void main(String[] args) {
        int a[]={1,4,5,7,8,2,9,10};
        rec(a,0);
    }
}

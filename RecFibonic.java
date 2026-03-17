public class RecFibonic {
    public static void main(String[] args){
        fib(20,0,1);
      
    }
    public static void fib(int range,int a,int b){
        if(a>=range){
            return;
        }
        int c=a+b;
          System.out.println(a+ " ");
        a=b;
        b=c;
        fib(range,a,b);
    }
}

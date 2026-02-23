public class Reverse {
    public static void main(String[] args) {
        int i =121;
        int a=0;
        while(i!=0){
            int rem=i%10;
            a=a*10+rem;
            i = i/10;
        }
        System.out.println(a);
    }
    
}

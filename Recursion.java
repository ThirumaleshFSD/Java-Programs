public class Recursion {
    public static void main(String[] args) {
        System.out.println("\n"+rec(1));
        System.out.println();
        System.out.println("end");
    }
    public static int rec(int num) {
        if(num>10)
             return 0;
        System.out.print(num+" ");
        return rec(num+1);
        
        
    }
}   

 
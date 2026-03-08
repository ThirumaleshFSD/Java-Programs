import java.lang.ClassNotFoundException;
public class ExceptionHandling {
    void m1(int age){
        
        if(age >=18){
            System.out.println("Eligible for voting");
        }
        else{
            throw new ArithmeticException("Not eligible for voting");
        }
    }
    public static void main(String[] args)  {
        
        ExceptionHandling d = new ExceptionHandling();
        try {
            d.m1(15);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }


        // try {
            
        //     int a=10/0;
        //     System.out.println(a);
        //     int x[]={1,2,3};
        //     System.out.println(x[5]);
            
            
        // }catch(ArithmeticException e1){
        //     System.out.println("ArithmeticException: "+e1);
        // }
        // catch(ArrayIndexOutOfBoundsException e2){
        //     System.out.println("ArrayIndexOutOfBoundsException: "+e2);
        // }
        // catch(Exception e1){

        // }
        
        

        
}
}

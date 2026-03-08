


public class Methods {
    public static void main(String[] args) {
        Methods obj = new Methods();
        
      System.err.println("starts here");
      obj.m1();
      obj.m3(10,20);
      obj.m2("thiru");

    }
     void m1(){
        
        
        System.err.println("m1()");
    }
    String m2(String s){
        
       
        System.out.println("m2()"+s);

        return null;
    }
    int m3(int a,int b){
        
        int c = a+b;
        System.out.println("m3()"+c);
        return c;
    }
    void m4(){
        System.out.println("m4()");
    }
}

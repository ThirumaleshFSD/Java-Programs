
    public class automorphicNumber {
    public static void main(String[] args) {

        int num = 25;
        int sq = num * num;
           while(num !=0){
           if(num%10!=sq%10){
            System.out.println("not automorphic");
            return;
           }
           num/=10;
           sq/=10;
           }
           System.out.println("Automorphic");
       
        
    }
}


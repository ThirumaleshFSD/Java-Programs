import java.util.Scanner;
public class perfect {
    public static void main(String[] args){
        perfect obj = new perfect();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int s=obj.number(num);
        int s1=obj.number(s);
        if(s == s1){
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
        
    }
    int number(int num){
        int sum = 0;
        for(int i=1; i<num; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        
        return sum;
    }
}

import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int a[]={1,2,3,0,0,4,5,0,-1};
       
        int temp[]=new int[a.length];
        int k=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                  temp[k++]=a[i];
            }
            
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                temp[k++]=a[i];
            }
        }
        System.out.println(Arrays.toString(temp));
        
        
    }
}

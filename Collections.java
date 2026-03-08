
import java.util.*;
public class Collections {
    public static void main(String[] args) {
      int arr[]={2,3,7,1,10};
      List odd=new ArrayList();
      List even=new ArrayList();
      for(int i=0;i<arr.length;i++){
          if(arr[i]%2==0){
              even.add(arr[i]);
          }
          else{
              odd.add(arr[i]);
          }
      }
      
         
//  int arr1[]=new int[odd.size()];
//  int arr2[]=new int[even.size()];
        
//         for(int i=0;i<arr1.length;i++){
//             arr1[i]=odd.get(i);
//         }
//         for(int i=0;i<arr2.length;i++){
//             arr2[i]=even.get(i);
//         }
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);
//         int ev[]=new int[arr2.length];
//         int x=0;
//         for(int i=arr2.length-1;i>=0;i--){
//             ev[x++]=arr2[i];
//         }
//         int od[]=new int[arr1.length];
//         int y=0;
//         for(int i=arr1.length-1;i>=0;i--){
//             od[y++]=arr1[i];
// //         }
//         System.out.println("Odd array elements in descending order: " + Arrays.toString(od));
//         System.out.println("Even array elements in descending order: " + Arrays.toString(ev));
     

}
}
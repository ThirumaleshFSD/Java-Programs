import java.util.*;

public class Repeted {
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,5,2};
        // int arr[] =new int[];
     Set<Integer> t=new TreeSet<Integer>();
     for(int i=0;i<arr.length;i++){
        if(t.contains(arr[i])){
            continue;
        //  t.add(arr[i]);
     }
     System.out.println(t);
     
    }
}
}

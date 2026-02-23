public class Duplicate {
    public static void main(String[] args) {
        int a=Integer.MAX_VALUE;

        int arr[]={1,1,2,3,4,5,2,3,5,5,10};

        for(int i=0;i<arr.length;i++){
            if(arr[i]==Integer.MAX_VALUE) continue;
            for(int j=i+1;j<arr.length;j++){
                 if(arr[i]==arr[j])
                if(arr[j]==Integer.MAX_VALUE) 
                    continue;
                else
                    arr[j]=Integer.MAX_VALUE;
            }
        }
        int c=0;
           for(int e:arr){
            if(e!=Integer.MAX_VALUE)
                c++;
            
           }
          int a1[]=new int[c];
            int k=0;
             for(int e:arr){
                if(e!=Integer.MAX_VALUE)
                    a1[k++]=e;
                
             }
             for(int e:a1){
                System.out.print(e + " ");
             }
    }
    
}

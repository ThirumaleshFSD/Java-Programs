public class frequency {
   public static void main(String[] args) {

        int a[]={1,1,2,3,4,5,2,3,5,5,4};
        int minCount = a.length;
        int minElement = a[0];
     
        for(int i=0;i<a.length;i++){
            int c=1;
            boolean f=false;
            for(int k=0;k<i;k++){
                if(a[k]==a[i])
                f=true;
            }
            if(f)continue;
            for (int j=0;j<a.length;j++){
                if(a[i]==a[j] && i!=j)
                c++;
                }
        //   math.max(c);
          System.out.println(a[i] + " = " + c);
          if(c<minCount ){
              minCount=c;
              minElement=a[i];
                }
                
        }       System.out.println("min element = " + minElement);
                System.out.println("min count = " + minCount);
               
}
}
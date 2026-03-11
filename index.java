public class index {
    public static void main(String[] args) {
        int t=10;
        int a[]={1,2,3,4,9};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==t){
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }
}

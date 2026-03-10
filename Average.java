public class Average {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        double sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println("Average is "+(sum/a.length));
    }
}

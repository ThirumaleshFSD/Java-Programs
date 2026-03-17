import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        int a[]={2,4,5,7,9,1,3};
        div(a,0,a.length-1);
        System.out.println(Arrays.toString(a));

    }
    public static void div(int a[],int st,int end){
        int mid=(st+end)/2;
        if(st>=end)return;
        div(a,st,mid);
        div(a,mid+1,end);
        arrange(a,st,mid,end);

     }
    public static void arrange(int a[],int st,int mid,int end){
        int temp[]=new  int[end-st+1];
        int i=st, j=mid+1,k=0;
        while(i<=mid && j<=end){
            temp[k++]=a[i]<a[j]?a[i++]:a[j++];
        } 
        
        while(i<=mid)temp[k++]=a[i++];
        while(j<=end)temp[k++]=a[j++];
        
        
        for(int l=0;l<temp.length;l++){
        a[l+st]=temp[l];
    }
}
}

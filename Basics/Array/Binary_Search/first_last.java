package Binary_Search;
import java.util.*;

public class first_last {
     static int first(int []arr, int k){
        int s=0;
        int e= arr.length-1;
        int mid,fi=-1;
        while(s<=e){
            mid = (s+e)/2;
            if(arr[mid]==k){
                fi= mid;
                e= mid-1;
            }
            else if(k>arr[mid]){
                s=mid+1;
            }
            else{
                e= mid-1;
            }
        }
        return fi;
    }
     static int last(int []arr, int k){
        int s=0;
        int e= arr.length-1;
        int mid,li=-1;
        while(s<=e){
            mid = (s+e)/2;
            if(arr[mid]==k){
                li= mid;
                s= mid+1;
            }
            else if(k>arr[mid]){
                s=mid+1;
            }
            else{
                e= mid-1;
            }
        }
        return li;
    }
    public static void main(String[] args) {
        int []arr= {1,2,3,3,3,3,5,6,7,7,7,8,9,9};
        int key= 8;
       int ans= first(arr,key);
       System.out.println("First Index is\t"+ans);
       System.out.println("last index is\t"+last(arr,key));
    }
}

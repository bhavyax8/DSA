package Array_Recursion;

import java.util.Arrays;

public class allIndices {
   // static int count=0;
public static int[] allIndices(int []arr, int idx, int x, int count){
    
    if(idx==arr.length){
        int []ans= new int[count];
        //System.out.println(ans.length);
        return ans;
    }
    if(x==arr[idx]){
       count++;
       }
    int[]recc= allIndices(arr, idx+1, x,count);
    if(arr[idx]==x){
        recc[count-1]=idx;  
       // count--;
    }
    return recc;
}
public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 3, 4, 3 };
   int []a=  allIndices(arr, 0, 3,0);
   System.out.println(Arrays.toString(a));
    
}
}
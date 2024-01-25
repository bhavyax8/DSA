package Backtracking;

public class targetSumSubset {
    public static void sumSubset(int[]arr,int idx,int sos,int sum,  String ans){
        if(idx==arr.length){
            if(sos==sum){
            System.out.println(ans);   
        }
        return;
        }
        sumSubset(arr, idx+1, sos+arr[idx], sum, ans+arr[idx]+" ");
        sumSubset(arr, idx+1, sos, sum, ans);
        
    }
    public static void main(String[] args) {
        int []arr={10, 20 ,30 , 40,60};

        sumSubset(arr,0,0,60,"");
    }   
}

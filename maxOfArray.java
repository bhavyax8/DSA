package Array_Recursion;

public class maxOfArray {
    public static int maxOfArray(int []arr, int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        
       int rec = maxOfArray(arr, idx+1);
        int curr= arr[idx];
        if(rec> curr){
             return rec;
        }
        else{
            return curr;
        }
        
    }
    public static void main(String[] args) {
        int []arr= {1,2,3,4,5};
        int a= maxOfArray(arr,0);
        System.out.println(a);
     }
}

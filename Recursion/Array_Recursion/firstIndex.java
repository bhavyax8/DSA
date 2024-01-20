package Array_Recursion;

public class firstIndex {
    public static int index(int[]arr,int x, int idx){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==x){
            return idx;
        }
      return  index(arr, x, idx+1);
        
    }
    public static void main(String[] args) {
        int []arr= {1,2,3,3,4,5};
       int a= index(arr, 3,0);
        System.out.println(a);
     }
}



package Array_Recursion;

public class displayArr {
 public static void display(int[]arr, int idx){
    if(idx==arr.length){
        return;
    }
    System.out.println(arr[idx]);
    display(arr, idx+1);
 }   
 public static void reverseArr(int[]arr, int idx){
    if(idx==arr.length){
        return;
    }
    reverseArr(arr, idx+1);
    System.out.println(arr[idx]);
    
 } 
 public static void main(String[] args) {
    int []arr= {1,2,3,4,5};
    display(arr, 0);
    reverseArr(arr, 0);
 }
}
// Array in reverse

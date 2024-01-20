package Binary_Search;

import java.util.*;

public class basicQues {
    static Scanner sc = new Scanner(System.in);
    public static int bin(int[]arr, int n){
        int s=0;
        int e= arr.length-1;
        int mid;
        while (s <= e) {
            mid = s + e / 2;
            if (n == arr[mid]) {
                return mid;
            } else if (n > arr[mid]) {
                s = mid + 1;

            } else if (n < arr[mid]) {
                e = mid - 1;

            }
            
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {34,67,89,90,112,145,346};
        //System.out.println("Enter key to find");
        int n = 89;
        int ans= bin(arr,n);
        System.out.println(ans);
        
        
    }
}

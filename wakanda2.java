package array2D;
import java.util.*;
public class wakanda2 {
    static Scanner sc= new Scanner(System.in);

    public static void input(int[][]arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j]= sc.nextInt();
            }
        }
    }
    public static void SOW(int [][]arr){
        int n= arr.length;
        for(int gap=0; gap<n; gap++){
            for(int i=0, j= gap; j<n;i++,j++){
                System.out.println(arr[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        int [][]arr= new int[4][4];
        input(arr);
        SOW(arr);
    }
    
}


// the pattern we observe is 
// in diagonal i==j i.e i-j = j-i = 0
// next diagonal j-i=1 and so on;
// Hence we set a set a loop of gap till gap < arr.length
// After this we proceed to printing the digits using loop

package array2D;

import java.util.Arrays;
import java.util.*;

public class array2D {
    // 2D array

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter rows");
            int n= sc.nextInt();
            System.out.println("Enter columns");
            int m= sc.nextInt();

            int [][] arr= new int[n][m];
            for(int row= 0; row<arr.length; row++){
                for(int col=0; col< arr[row].length; col++){
                     arr[row][col]= sc.nextInt();
                }
            }
            // for(int row= 0; row<arr.length; row++){
            //     for(int col=0; col< arr[row].length; col++){
            //          System.out.print(arr[row][col]+"\t");
            //     }
            //     System.out.println();
            // }
            for(int [] a: arr){
            System.out.println(Arrays.toString(a));}
        }
    }
}

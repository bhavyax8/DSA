package array2D;
import java.util.*;

public class arrRotate {
    public static void input(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    //2 step method 
    //transpose
    public static void transpose(int[][]arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<=i; j++){
                if(arr[i][j]!= arr[j][i]){
                 int temp= arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
        }

    }
    // reverse column
    public static void reverse(int [][]arr){
        for(int j=0; j<arr.length; j++){
            int s=0;
            int e=arr.length-1;
            while(s<=e){
                int temp= arr[j][s];
                arr[j][s]=arr[j][e];
                arr[j][e]= temp;
                s++;
                e--;
            }
        }
        
    }
    
    public static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int n=4, m=4;
        int [][]arr= new int [n][m];
        
        System.out.println();
        input (arr);
        display(arr);
        transpose(arr);
        display(arr);
        System.out.println();
       reverse(arr);
       display(arr);

    }
}

package array2D;
import java.util.*;
public class search2D {
    static Scanner sc= new Scanner(System.in);

    public static void input(int[][]arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j]= sc.nextInt();
            }
        }
    }
    public static void search(int [][]arr,int data){
        int n= arr.length;
        int row=0;
        int col= n-1;
        
        while(row<n-1 && col>=0){
            if(arr[row][col]== data){
                System.out.println(row+1 +","+ (col+1));
                return;
            }
            if(arr[row][col]<data){
                row++;
            }
            else{
                col--;
            }
        }
        System.out.println("Not Found");
    }
    
    public static void main(String[] args) {
        System.out.println("Enter number to find");
        int data= sc.nextInt();
        int arr[][]= new int[3][3];
        input(arr);
        search(arr,data);
    }
}

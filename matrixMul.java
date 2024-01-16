package array2D;

import java.util.Scanner;


public class matrixMul {
     static Scanner sc= new Scanner(System.in);
     public static int[][] input(int n, int m)
     {
        int [][]arr= new int[n][m];
        for(int i=0; i<arr.length; i++){
            for(int j =0; j< arr[i].length; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        return arr;
     }
     public static void display(int[][]arr){
        
        for(int i=0; i<arr.length; i++){
            for(int j =0; j< arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
     }

     static int[][] multiply(int[][]A, int[][]B){
        int n1=A.length;
        int m1= A[0].length;
        
        int m2= B[0].length;
        int [][]c= new int[n1][m2];
        for(int i=0; i<n1; i++){
            int sum=0;
            for(int j=0; j<m2;j++){
                for(int k=0; k<m1; k++){
                    
                     sum+= A[i][k]* B[k][j];
                }
                c[i][j]= sum;
            }
        }
        return c;
     }
     public static void main(String[] args) {
        //input matrix 1
        int n= 1,m1= 2;
        int [][]arr= input(n,m1);
        int n2= 2, m2= 1;
        int[][]arr2= input(n2,m2);

        if(m1!=n2){
            System.out.println("Invalid");
        }
        else{
         int [][]C=   multiply(arr,arr2);
        display(C);
        }

        

     }
    
}

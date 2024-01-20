package array2D;

import java.util.Scanner;

public class saddlePrice {
    static Scanner sc= new Scanner(System.in);

    public static void input(int[][]arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j]= sc.nextInt();
            }
        }
    }
    public static void saddle(int [][]arr){
        int col=0;
        int min= Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            
            // finding min int in row
            for(int j=0 ;j<arr[0].length; j++){
                if(arr[i][j]<min){
                    min= arr[i][j];
                    col=j;
                }     
            }
        }
        boolean saddle= true;
        for(int i=0 ; i<arr.length; i++){
            if(arr[i][col]>min){
                saddle= false;
                break;
            }
            if(saddle==true){
                System.out.println(min);
                return;
            }
        }
        System.out.println("No saddle point");
    }
    public static void main(String[] args) {
        int [][]arr= new int[4][4];
        input(arr);
        saddle(arr);
    }
}

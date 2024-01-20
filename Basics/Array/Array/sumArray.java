package Array;
import java.util.*;
public class sumArray {
    public static void main(String[ ]args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size");
        int n= sc.nextInt();
        int []arr1= new int [n];
        int []arr2= new int [n];
        System.out.println("Enter array 1");
        for(int i=0; i<arr1.length; i++){
            arr1[i]= sc.nextInt();
        }
        System.out.println("Enter array 2");
        for(int i=0; i<arr2.length; i++){
            arr2[i]= sc.nextInt();
        }
        int []Farr= new int [n];
        for(int i =0; i<n; i++){
            Farr[i]= arr1[i]+arr2[i];
            System.out.print(Farr[i]);
        }

    }
    
}

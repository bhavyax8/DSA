package Array;
import java.util.*;

public class spanArray {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        int n= sc.nextInt();
        int []arr= new int[n];
        int max=0, min=-1;
        
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        
            max= arr[0];
            min= arr[0];
            for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max= arr[i];
            }
            if(arr[i]<min){
                min= arr[i];
            }
        }
            
            
        
        System.out.println("Span of array");
        System.out.println(max-min);
    }
    
}

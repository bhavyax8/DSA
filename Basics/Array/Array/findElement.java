package Array;
import java.util.*;
public class findElement {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size");
        int n= sc.nextInt();
        int []arr= new int [n];
        
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the number");
        int m= sc.nextInt();
        for(int i=0; i<n; i++){
            if(arr[i]==m){
                System.out.println(i);
                break;
            }
            
        }
    }
}

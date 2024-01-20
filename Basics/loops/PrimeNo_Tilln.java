package loops;
import java.util.*;

public class PrimeNo_Tilln {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int n= sc.nextInt();
        int low= sc.nextInt();

        for(int i=low+1; i<=n; i++){
            int count=0;
            for(int j=2; j*j<=i; j++){
              if(i%j==0){
                count++;
                break;
              }  
              
              
            }
             if(count==0){
                System.out.println(i);
              }
        }
    }
    
}

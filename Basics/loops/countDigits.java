package loops;
import java.util.*;

public class countDigits {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int n= sc.nextInt();
        int count=0;
        do{
           n= n/10;
           count++;
        }
        while(n!=0);
        System.out.println(count);
    }
    
}

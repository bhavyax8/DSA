package loops;
import java.util.*;

public class digitsNumber {
    public static void main(String[]args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int n= sc.nextInt();
        int count=0;
        int temp;
        while(n!=0){
            
            temp=n/10;
            count++;
        }
        int div= (int)Math.pow(10,count-1);
        while(n!=0){
            int q= n/div;
            System.out.println(q);
            n= n%div;
            
            div= div/10;
        }
    }
    
}

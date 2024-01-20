package loops;
import java.util.*;
public class rotateNo {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int n= sc.nextInt();
        System.out.println("Rotations");
        int k= sc.nextInt();

        int temp =n, count=0, div=1, mul=1;

        while(temp>0){
            temp= temp/10;
            count++;
        }
        k= k%count;
        if(k<0){
            k= k+count;
        }

        for(int i=1; i<=count; i++){
            if(i<=k){
                div= div*10;
            }
            else{
                mul = mul*10;
            }

        }
        int q= n/div;
        int r= n%div;

        int rot = (r*mul ) + q;
        System.out.println(rot);

    }
    
}

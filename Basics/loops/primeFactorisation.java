package loops;

public class primeFactorisation {
    public static void main(String []args){
        int n= 1440;
        for(int i=2; i<=n; i++){
            while(n%i==0){
                n= n/i;
                System.out.print(i+" ");
            }
        }
    }
    
}

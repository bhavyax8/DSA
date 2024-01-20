package loops;

public class reverseNo {
    public static void main(String []args){
        int n= 6735;
        int dig=0;
        while(n!=0){
            dig=n%10;
            System.out.print(dig);
            n= n/10;
        }
    }
    
}

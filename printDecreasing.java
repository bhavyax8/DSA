public class printDecreasing {
    public static void Decrease(int n){
        System.out.println(n);
        if(n>=1)
        Decrease(n-1);
        
    }
    public static void Increase(int n){
        System.out.println(n);
        if(n>10)
        Increase(n+1);
        
    }
    public static void decInc(int n){
        System.out.println(n);
        if(n>=1)
        decInc(n-1);
        
        System.out.println(n);
    }
    public static void main(String[] args) {
        // Decrease(10);
        // Increase(1);
        decInc(10);
    }
}


///Recursion intro
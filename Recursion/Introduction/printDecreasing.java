public class printDecreasing {
    public static void Decrease(int n){
        if(n<1) return;
        
        System.out.println(n);
        Decrease(n-1);
        
    }
    public static void Increase(int n){
        if(n<1)
        return;
        Increase(n-1);
        System.out.println(n);
        
    }
    public static void decInc(int n){
        if(n<1) return;
        
        System.out.println(n);
        decInc(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        // Decrease(10);
        // Increase(11);
        decInc(10);
    }
}


///Recursion intro
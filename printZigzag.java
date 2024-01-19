public class printZigzag {
    public static void printZigzag(int n){
        if(n==0){
            return;
        }
        System.out.print(n+ " ");
        printZigzag(n-1);
        System.out.print(n+ " ");
        printZigzag(n-1);
        System.out.print(n+ " ");
        
    }
    public static void main(String[] args) {
        printZigzag(3);
    }
}

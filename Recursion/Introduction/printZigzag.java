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

// special pattern ques
// flow of memeory stack --> explained through this
//input 3--> 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3 

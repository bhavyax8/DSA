public class towerOfHanoi {
    public static void towerOfHanoi(int n, int A, int B, int C){
        if(n==0){
            return;
        }
        towerOfHanoi(n-1, A, C, B);
        System.out.println(n+"["+ A+ "-->"+ B+"]");
        towerOfHanoi(n-1, C,B, A);
    }
    public static void main(String[] args) {
        towerOfHanoi(3, 10,11 , 12);
    }
}

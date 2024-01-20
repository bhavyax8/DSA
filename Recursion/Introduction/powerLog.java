public class powerLog {
    public static int powerLog(int n, int x){
        if(x==0){
            return 1;
        }
        int half= powerLog(n, x/2);
        int xn= half*half;
        if(x%2==1){
            xn= xn*n;
        }
        return xn;
    }
    public static void main(String[] args) {
        System.out.println(powerLog(2, 12));
    }
}

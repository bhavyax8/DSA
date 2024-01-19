public class powerLinear {
    public static int power(int n, int x){
        if(x==0){
            return 1;
        }
      int ans=  n* power(n, x-1);
      return ans;
    }
    public static void main(String[] args) {
        System.out.println(power(4, 4));
    }
}

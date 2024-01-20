public class baseConversion3 {
    public static int fun(int n, int b, int c){
        int p=1;
        int rv=0;
        int dig;
        while(n!=0){
            dig= n%c;
            n= n/c;
            rv+= dig*p;
            p= p*b;
        }
        return rv;
    }
    public static void main(String[]args){
        System.out.println(fun(634,10,8));
    }
}

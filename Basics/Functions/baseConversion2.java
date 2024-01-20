public class baseConversion2{
    public static int fun(int n, int b){
        int p=1;
        int dig;
        int rv=0;
        while(n!=0){
            dig= n%10;
            n= n/10;
            rv+= dig*p;
            p= p*b;
        }
        return rv;
    }
    public static void main (String[]args){
        int c= fun(1172,8);
        System.out.println(c);

    }
}
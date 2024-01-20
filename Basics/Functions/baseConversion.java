public class baseConversion {
    // Decimal to any base

    public static int base(int n, int b){
        int dig;
        int rv=0;
        int p=1;
        while (n!=0){
            dig= n%b;
            n= n/b;
            rv +=dig*p;
            p= p*10;
        }
        return rv;
    }
    public static void main(String[]args){
        int c= base(634,8);
        System.out.println(c);

    }
    
}

public class baseAddition {
    public static int fun(int n1,int n2, int b){
        int p=1;
        int rv=0;
        int c=0;
    while(n1>0 || n2>0 || c>0){
        int d1= n1%10;
        int d2= n2%10;
        n1= n1/10;
        n2= n2/10;

        int d= d1+ d2 +c;
        c= d/b;
        d= d%b;

        rv+= d*p;
        p= p*10;
    }
    return rv;
    }

    public static void main(String[]args){
        System.out.println(fun(236, 754, 8));
    }
    
}

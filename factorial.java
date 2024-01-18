public class factorial {
 public static int factorial(int n){
    if(n==0) return 1;

   int reAns =factorial(n-1);
   int fAns= n* reAns;
   return fAns;

   // return (n==0)? 1: n*factorial(n-1); // same functioning in 1 line
 }   
 public static void main(String[] args) {
   int s= factorial(5);
   System.out.println(s);
 }
}

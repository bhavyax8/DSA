import java.util.Scanner;

public class digitFrequency {
    public static int fun(int n, int d){
        int count=0;
        int dig;
        while (n!=0){
            dig= n%10;
            n= n/10;
            if(dig==d){
                count++;
            }
        }
        return count;
    }
    public static void main(String []args){
       
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int n= sc.nextInt(); 
        System.out.println("Enter Digit");
        int d= sc.nextInt();
        int c= fun(n,d);
        System.out.println("Total Digit Count");
        System.out.println(c);
    }
}

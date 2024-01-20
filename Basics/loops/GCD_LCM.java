package loops;

import java.util.*;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter NuMS");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int Max, Min;

        // Find Max and Min from given nums
        if (n > m) {
            Max = n;
            Min = m;
        } else {
            Min = n;
            Max = m;
        }

        // For GCD- greatest commom divisor
        for (int i = Min; i >1; i--) {
            if (n % i == 0 && m % i == 0) {
                System.out.println("GCD");
                System.out.println(i);
                break;
            }
        }

        //For LCD- lowest Common Divisor
        for(int i= 2; i<Min; i++){
            if (n % i == 0 && m % i == 0) {
                System.out.println("LCD");
                System.out.println(i);
                break;
            }
        }
    }
}

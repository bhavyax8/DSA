package array2D;

import java.util.Scanner;

public class exitPoint {
    public static Scanner sc = new Scanner(System.in);

    // input
    public static void input(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void exitP(int[][] arr) {
        // N=0 E=1 S=2 W=3
        int dir = 0;
        int n = arr.length;
        int m = arr[0].length;
        int i = 0, j = 0;
        while (true) {
            dir += arr[i][j];
            dir %= 4;
            if (dir == 0) {
                j++;
            } else if (dir == 1) {
                i++;
            } else if (dir == 2) {
                j--;
            } else if (dir == 3) {
                i--;
            }
             if(i<0 ||i>=n||j<0||j>=m){
                break;
             }
        }
        if(i<0)
        i++;
        else if(i>=n)
        i--;
        else if (j<0)
        j++;
        if(j>=m)
        j--;
        System.out.println(i+" row "+ j +" col");
       

    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        int[][] arr = new int[n][m];
        input(arr);
        exitP(arr);
    }
}

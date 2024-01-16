package array2D;

import java.util.*;

public class Wakanda {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < m; j++) {
            if (j % 2 != 0) {
                for (int i = n-1; i >= 0; i--) {
                    System.out.println(arr[i][j]);
                }
            } else {

                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i][j]);
                }
            }
        }

    }
}

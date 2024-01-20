package Binary_Search;
import java.io.*;
    import java.util.*;
public class brokenEconomy {

    

  public static void eco(int []arr, int key) {
    int s = 0;
    int e = arr.length - 1;
    int ceil = 0;
    int floor = 0;
    int mid;

    while (s <= e) {
      mid = (s +e)/2;
      if (arr[mid] == key) {
        floor = arr[mid];
        ceil = arr[mid];
        break;
      }

      else if (key < arr[mid]) {
        e = mid - 1;
        ceil = arr[mid];
      }

      else {
        s = mid + 1;
        floor = arr[mid];
      }
    }
    System.out.println(ceil);
  
    System.out.println(floor);

  }

  public static void main(String []args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int []a = new int[n];
    for (int i = 0 ; i < a.length; i++) {
      a[i] = sc.nextInt();
    }

    int d = sc.nextInt();
    eco(a,d);
  }

}

package strings;
import java.util.Scanner;

public class pallindromicSeq {
    static Scanner sc = new Scanner(System.in);

    public static boolean isPallindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void Solution(String str){
        int n= str.length();
        for(int st =0; st<n; st++){
            for(int end= st; end<n; end++){
                String s = str.substring(st, end+1);
                if(isPallindrome(s)){
                    System.out.println(s);
                }
            }
        }
    }

    public static void main(String[] args) {
        String st= "GAATTC";
        Solution(st);
    }
}

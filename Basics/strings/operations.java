package strings;
import java.util.Scanner;
public class operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //concatenation
        //a+b
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1+ str2);

        //input
        String x= sc.next(); //take next word without space
        System.out.println(x);
        String y= sc.nextLine(); //take next line
        System.out.println(y);

        //content mqtching i.e word by word match
        System.out.println(str1.equals(x));  

        //string match
        if(str1==str2){
            System.out.println("true");
        }

        //substring
        // can be given 1 parameter or 2
        String s= str1.substring(1);
        System.out.println(s);
        String a= str2.substring(0,2);
        System.out.println(a);
    }
}

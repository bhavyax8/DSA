package Recursion_on_the_way_up;
public class encoding {
    public static void encoding(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        if(str.charAt(0)=='0'){
            System.out.println("nvalid");
            return;
        }
        char ch= str.charAt(0);
        int v1= ch- '0';
        encoding(str.substring(1), ans+ (char)(v1+'a'-1));

        if(str.length()>1)
        {char ch2= str.charAt(1);
        int v2= ch2- '0';
        int num= v1*10 +v2;
        encoding(str.substring(2), ans+ (char)(num+'a'-1));}

    }
    public static void main(String[] args) {
        encoding("0123", "");
    }
}

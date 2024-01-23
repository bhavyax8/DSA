package Recursion_on_the_way_up;
public class getSubseuence {
    public static void getSubseuence(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch= str.charAt(0);

        getSubseuence(str.substring(1), ans+ch);
        getSubseuence(str.substring(1), ans);

    }
    public static void main(String[] args) {
        getSubseuence("abc", "");
    }
    
}

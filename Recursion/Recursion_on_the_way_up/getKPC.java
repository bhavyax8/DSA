package Recursion_on_the_way_up;

public class getKPC {
    static String[] arr={";","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void getKPC(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch= str.charAt(0);
        int idx= ch- '0';
        String code= arr[idx];
        for(int i=0; i<code.length(); i++){
            char newc= code.charAt(i);
            getKPC(str.substring(1), ans+ newc);
        }
    }
    public static void main(String[] args) {
        getKPC("78", "");
    }
}

package Recursion_on_the_way_up;
public class printStairPath {
    public static void stair(int n, String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        if(n-1>=0){
            stair(n-1,ans+1);
        }
        if(n-2>=0){
            stair(n-2,ans+2);
        }
        if(n-3>=0){
            stair(n-3,ans+3);
        }
    }
    public static void main(String[] args) {
       stair(3, "");
    }
}

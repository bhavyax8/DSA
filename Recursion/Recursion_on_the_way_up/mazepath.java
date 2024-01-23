package Recursion_on_the_way_up;
public class mazepath {
 public static void mazepath(int sr, int sc, int dr, int dc, String ans){
    if(sr==dr && sc== dc){
        System.out.println(ans);
        return;
    }
    if(sc+1<=dc)
    mazepath(sr, sc+1, dr, dc, ans+"h");

    if(sr+1<=dr)
    mazepath(sr+1, sc, dr, dc, ans+"v");
 }   
 public static void main(String[] args) {
    mazepath(0, 0, 2, 2, "");
 }
}

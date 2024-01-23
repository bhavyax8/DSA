package Recursion_on_the_way_up;
public class mazePathWithJump {
 static int[][] dir={{0,1},{1,0},{1,1}};
 static String[] dirN= {"h","v","d"};

 public static void mazePathWithJump(int sr, int sc, int dr, int dc, String ans){
    if(sr==dc && sc== dc){
        System.out.println(ans);
        return;
    }
    for(int d=0; d<dir.length; d++){
        for(int jump=1; jump<Math.max(dr, dc); jump++){
            int r= sr+ (jump * dir[d][0]);
            int c= sc+ (jump * dir[d][1]);
            if(r>=0 && r<=dr && c>=0 && c<=dc){
                mazePathWithJump(r, c, dr, dc, ans+dirN[d]+jump);
            }
        }
    }
 }
  public static void main(String[] args) {
        mazePathWithJump(0, 0, 2, 2, "");
    }
// older apprroach


    // public static void mazePathWithJump(int sr, int sc, int dr, int dc, String ans){
    //     if(sr==dr && sc==dc){
    //         System.out.println(ans);
    //     }
    //     for(int jump=1; sr+jump<= dr; jump++){
    //         mazePathWithJump(sr+jump, sc, dr, dc, ans+"v"+jump);
    //     }
    //     for(int jump=1; sc+jump<= dc; jump++){
    //         mazePathWithJump(sr, sc+jump, dr, dc, ans+"h"+jump);
    //     }
    //     for(int jump=1; sr+jump<= dr && sc+jump<=dc; jump++){
    //         mazePathWithJump(sr+jump, sc+jump, dr, dc, ans+"d"+jump);
    //     }
    // }
   
}

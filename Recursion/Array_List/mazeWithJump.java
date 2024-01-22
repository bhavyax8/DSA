package Array_List;

import java.util.ArrayList;

public class mazeWithJump {
    public static ArrayList<String> mazeWithJump(int sr,int sc, int dr, int dc){
        if(sr==dr && sc==dc){
            ArrayList<String> base= new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> ans= new ArrayList<>();
        for(int jump=1; sr+jump<= dr; jump++){
            ArrayList<String> vcall= mazeWithJump(sr+jump, sc, dr, dc);
            for(String ele: vcall){
                ans.add("v"+jump+ ele);
            }
        }
        for(int jump=1; sc+jump<= dc; jump++){
            ArrayList<String> hcall= mazeWithJump(sr, sc+ jump, dr, dc);
            for(String ele: hcall){
                ans.add("h"+jump+ ele);
            }
        }
        for(int jump=1; sr+jump<= dr && sc+jump<=dc; jump++){
            ArrayList<String> dcall= mazeWithJump(sr+1, sc+1, dr, dc);
            for(String ele: dcall){
                ans.add("d"+jump+ ele);
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        int row= 3;
        int col=3;
        ArrayList<String> result= mazeWithJump(0, 0, row-1, col-1);
        System.out.println(result);
    }
    
}

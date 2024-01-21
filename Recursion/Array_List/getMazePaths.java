package Array_List;

import java.util.ArrayList;

public class getMazePaths {
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc){
        if(sr==dr && sc==dc){
            ArrayList<String> base= new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> ans= new ArrayList<>();

        if(sc+1<=dc){
        ArrayList<String> hcall= getMazePaths(sr, sc+1, dr, dc);
        for(String ele: hcall){
            ans.add("h"+ ele);
        }
    }
        if(sr+1<=dr){
        ArrayList<String> vcall= getMazePaths(sr+1, sc, dr, dc);
        for(String ele: vcall){
            ans.add("v"+ ele);
        }
    }
       return ans;
    }
    public static void main(String[] args) {
        int row= 3;
        int col=3;
        ArrayList<String> result= getMazePaths(0, 0, row-1, col-1);
        System.out.println(result);
    }
}

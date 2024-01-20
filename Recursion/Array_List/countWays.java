package Array_List;

import java.util.ArrayList;

public class countWays {
    public static ArrayList<String> countWays(int n){
        if(n==0){
            ArrayList<String> base= new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> ans= new ArrayList<>();
        if(n-1>= 0)
       { 
        ArrayList<String> nm1=  countWays(n-1);
        for(String ele: nm1){
            ans.add(1+ele);
        }
    }
        if(n-2>= 0)
        {
            ArrayList<String> nm2=  countWays(n-2);
            for(String ele: nm2){
                ans.add(2+ele);
            }
        }
        if(n-3>= 0)
       {
         ArrayList<String> nm3=  countWays(n-3);
         for(String ele: nm3){
            ans.add(3+ele);
        }
    }
    return ans;
    }
    public static void main(String[] args) {
      ArrayList<String> a=  countWays(4);
        System.out.println(a);
    }
    
}

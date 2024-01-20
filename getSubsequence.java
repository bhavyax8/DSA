package Array_List;

import java.util.ArrayList;

public class getSubsequence {
    public static ArrayList<String> getSubsequence(String str){
        if(str.length()==0){
            ArrayList<String> base= new ArrayList<>();
         base.add("");
         return base;
        }
      char ch= str.charAt(0);
    ArrayList<String> rec= getSubsequence(str.substring(1));
    ArrayList<String> ans= new ArrayList<>();

    for(String ele:rec){
        ans.add(ele);
    }
    for(String ele:rec){
        ans.add(ch+ele);
    }
    return ans;
    }
    public static void main(String[] args) {
        System.out.println(getSubsequence("abc"));
    }
}

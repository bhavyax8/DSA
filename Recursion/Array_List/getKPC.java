package Array_List;

import java.util.ArrayList;

public class getKPC {
    static String[] arr={";","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str){
        if(str.length()==0){
            ArrayList<String> base= new ArrayList<>();
            base.add("");
            return base;
        }
        char ch= str.charAt(0);

        ArrayList<String> rec=  getKPC(str.substring(1));
        ArrayList<String> ans= new ArrayList<>();
         int idx= ch- '0';
         String codes= arr[idx];
         for(int i=0; i<codes.length();i++){
            char newc= codes.charAt(i);
            for(String ele: rec){
                ans.add(newc+ele);
            }
         }
         return ans;

    }
    public static void main(String[] args) {
        ArrayList <String> a= getKPC("91");
        System.out.println(a);
    }

}

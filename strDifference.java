// We need to find the difference of two consecutive string char
// and place their difference betwwen those 2 char

package strings;

public class strDifference {
    public static StringBuilder strDifference(String str){
        StringBuilder ans= new StringBuilder();
        ans.append(str.charAt(0));
        for(int i=1; i< str.length(); i++){
            char prev= str.charAt(i-1);
            char curr = str.charAt(i);
            int diff= curr-prev;
            ans.append(diff);
            ans.append(curr);
        }
        return ans;
       // return ans.toString(); // this function convert SB to string
    }
    public static void main(String[] args) {
        System.out.println(strDifference("pepcoding"));
    }
}

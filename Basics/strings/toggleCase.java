package strings;

public class toggleCase {
    // lowercase char ko uppercase me convert karna hai and vice versa
    //uske baad final string print
    public static StringBuilder toggleCase(String s){
        StringBuilder sb= new StringBuilder(); //SB is similar to String but faster so using

        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            //for lowercase to upper
            // D - A = d - a formula
            if(ch>= 'a' && ch<= 'z'){
                char uc = (char)(ch-'a'+ 'A'); //typecast
                sb.append(uc);
            }
            if(ch>='A' && ch<= 'Z'){
                char lc =(char)(ch-'A'+'a');
                sb.append(lc);
            }
        }
        return sb;
    }
    public static void main(String[] args) {
        String str="aBHHbakd";
        System.out.println(toggleCase(str));

    }
}

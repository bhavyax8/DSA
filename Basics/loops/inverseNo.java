package loops;

public class inverseNo {
    public static void main(String [] args){
        int inv=0;
        int op =1;
        int n= 135246;
        while(n!=0){
            int od= n%10;
            int id= op;  // original place uski digit ban gyi
            int ip= od;  // original digit uski place ban gyi

            //Main 
            inv= inv + id* (int)Math.pow(10,ip-1);
            
             n= n/10;
             op++;
        }
        System.out.println(inv);
    }
    
}

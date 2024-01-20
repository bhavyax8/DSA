package Pattern;

public class pattern15 {
    public static void main(String[]args){
        int n=4;
        int st= 1;
        int sp= 2*n-3;
        
        
        for(int i=1; i<=n; i++){
            int val=1;

            for(int j=1; j<= st; j++){
                System.out.print(val);
                val++;
            }
            for(int j=1; j<=sp; j++){
                System.out.print(" ");
            }
            if(i==n){
                st--;
                val--;
            }
            for(int j=1; j<=st; j++){
                val--;
                System.out.print(val);
            }
            sp-=2;
            st++;
            System.out.println();
        }
    }
    
}

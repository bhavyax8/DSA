package Pattern;
// Hollow diamond pattern 
public class pattern10 {
    public static void main(String[]args){
        int n=5;
        int os= n/2; //outer space 
        int is= -1; // inner space
        for(int i=1; i<=n; i++){
            for(int j=1; j<=os; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=1; j<=is; j++){
                System.out.print(" ");
            }
            if(i<=n/2){
                os--;
                is+=2;
            }
            else{
                os++;
                is-=2;
            }
            if(i>1 && i<n){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

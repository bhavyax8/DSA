package Pattern;
//hour class
public class pattern17 {
    public static void main(String[]args){
        int n=7;
        int st=n;
        int sp=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sp; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=st; j++){
                if(i>1 && i<n/2 && j>1 && j<st){
                    System.out.print(" ");
                }
               else {System.out.print("*");}
            }
            
            if(i<=n/2){
                st-=2;
                sp++;
            }
            else{
                st+=2;
                sp--;
            }
            System.out.println();
        }

    }
}

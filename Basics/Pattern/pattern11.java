package Pattern;
// number print in increasing order
//1
//2 3
//4 5 6
public class pattern11 {
    public static void main(String[]args){
        int n=5;
        int val=1;
        for(int i=1;i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print(val+" ");
                val++;
            }
            System.out.println();
        }
    }
}

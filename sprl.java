package array2D;
import java.util.*;



public class sprl {
    public static Scanner sc = new Scanner(System.in);

    public static void input(int[][]arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length;j++){
                arr[i][j]= sc.nextInt();
            }
        }
    }

    //main spiral function 
    public static void spiral(int [][]arr){
        int n=arr.length;
        int m= arr[0].length;
        int count=0;
        int total= n*m;
        int minr=0;
        int minc=0;
        int maxr= n-1;
        int maxc=m-1;

        //4 loop will be needed
        // loop 1 minr-> maxr keeping j constant 
       while(count<total) { 
        for(int i=minr; i<=maxr && count<total ;i++){
            System.out.print(arr[i][minc]+"->");
            count++;
        }
        minc++;

        //loop 2 minc->maxc keep maxr constant
        for(int i=minc; i<=maxc && count<total; i++){
            System.out.print(arr[maxr][i]+"->");
            count++;
        }
        maxr--;

        //loop 3 maxr->minr keeping maxc const
        for(int i=maxr; i>=minr && count<total; i--){
            System.out.print(arr[i][maxc]+"->");
            count++;
        }
        maxc--;

        //loop 4 maxc->minc keeping minr cosnt
        for(int i=maxc; i>=minc && count<total; i--){
            System.out.print(arr[minr][i]+"->");
            count++;
        }
        minr++;
    }
    }
    public static void main(String[] args) {
        int n= 3;
        int m=4;
        int [][]arr= new int[n][m];
        input(arr);
        

        spiral(arr);
    }
    
}

package Backtracking;

public class nQueen {
    public static void Queen(int[][]arr, String ans, int row){
        if(row==arr.length){
            System.out.println(ans);
            return;
        }
        for(int col=0; col<arr.length; col++){
            if(check(arr, row, col))
            {arr[row][col]=1;
            Queen(arr, ans+ row+col+" ", row+1);
            arr[row][col]=0;}
        }
    }
    public static boolean check(int[][]arr,int row,int col){
        for(int i=row-1,j=col;i>=0;i--){
            if(arr[i][j]==1){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(arr[i][j]==1){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0&& j<arr.length;i--,j++){
            if(arr[i][j]==1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [][]arr= new int[8][8];
        Queen(arr, "", 0);
    }
}

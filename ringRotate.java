package array2D;
import java.util.Scanner;

public class ringRotate {
    public static Scanner sc= new Scanner(System.in);
    //input array 2d
    public static void input(int[][]arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length;j++){
                arr[i][j]= sc.nextInt();
            }
        }
    }
    // display 1d array
    public static void display1D(int[]arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //display 2d array
    public static void display2D(int[][]arr){
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    // 2d array to 1d array
    static int sizeArr=0;
    public static int[] arr1(int [][]arr, int s){
        int n= arr.length;
        int m= arr[0].length;
        int minr= s-1;
        int maxr= n-s;
        int minc= s-1;
        int maxc= m-s;
        int idx=0;
        int size= 2*(maxr- minr + maxc-minc);
        sizeArr= size;
        int [] OneD= new int[size];

        for(int i=minr; i<=maxr; i++){
            OneD[idx]= arr[i][minc];
            idx++;
        }
        minc++;
        for(int i=minc; i<=maxc; i++){
            OneD[idx]= arr[maxr][i];
            idx++;
        }
        maxr--;
        for(int i=maxr; i>=minr; i--){
            OneD[idx]= arr[i][maxc];
            idx++;
        }
        maxc--;
        for(int i=maxc; i>=minc; i--){
            OneD[idx]= arr[minr][i];
            idx++;
        }
        minr++;
        return OneD;

    }
    
    // rotate 1D array--> 1st break array-> reverse both-> join-> reverse again
    public static void rotate (int []arr, int r){
        r= r%arr.length;
        if(r<0) r= r+ arr.length;

        //part 1 
        reverse(arr, 0, r-1);
        // part 2
        reverse(arr, r, arr.length-1);
        //part 3
        reverse(arr, 0, arr.length-1);

    }
     
    public static void reverse(int []arr, int i, int j){
        int li=i;
        int ri= j;
        while(li<ri){
            int temp= arr[li];
            arr[li]= arr[ri];
            arr[ri]= temp;
            li++;
            ri--;
        }
        }
    
    // 1d array to 2d array

    public static void finalArr (int[][]arr ,int s, int[]OneD){
        int n= arr.length;
        int m= arr[0].length;
        int minr= s-1;
        int maxr= n-s;
        int minc= s-1;
        int maxc= m-s;
        int idx=0;

        for(int i=minr; i<=maxr; i++){
            arr[i][minc]= OneD[idx];
            idx++;
        }
        minc++;
        for(int i=minc; i<=maxc; i++){
           arr[maxr][i]= OneD[idx] ;
            idx++;
        }
        maxr--;
        for(int i=maxr; i>=minr; i--){
           arr[i][maxc]= OneD[idx];
            idx++;
        }
        maxc--;
        for(int i=maxc; i>=minc; i--){
            arr[minr][i]=OneD[idx];
            idx++;
        }
        minr++;
       

    }

    public static void main(String[] args) {
        int [][]arr= new int[4][4];
        System.out.println("Enter the shell value ");
        int s= sc.nextInt();
        System.out.println("Enter rotate value");
        int r= sc.nextInt();
        System.out.println("Enter array values");
        input(arr);

       int[]arrf= arr1(arr,s);
       rotate(arrf, r);
       display1D(arrf);
       finalArr(arr, s, arrf);
       display2D(arr);
    }
}

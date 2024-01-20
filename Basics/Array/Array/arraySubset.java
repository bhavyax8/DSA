package Array;

public class arraySubset {

    public static void subset(int[]arr){
        int n= arr.length;
        int total= (int )Math.pow(2, n);
        for(int i=0 ; i< total; i++){
            int temp= i;
            String str= "";
            for(int j=n-1; j>=0; j--){
                int r= temp%2;
                temp= temp/2;

                if(r==0){
                    str= "-\t"+ str;
                }
                else{
                    str= arr[j]+"\t"+ str;
                }
            }
            System.out.println(str);
        }
    }
    public static void main(String[] args) {
        
        int[] arr = { 10, 20, 30 };
        
        subset(arr);
    }

}

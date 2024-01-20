package Array_Recursion;

public class lastIndex {
    public static int index(int[] arr, int x, int idx) {
        if (idx == arr.length) {
            return -1;
        }
        int li = index(arr, x, idx + 1);
        if (li == -1) {

            if (arr[idx] == x) {
                return idx;
            } else {
                return li;
            }
        } else {
            return li;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 4, 5 };
        int a = index(arr, 3, 0);
        System.out.println(a);
    }
}

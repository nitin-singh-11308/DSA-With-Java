public class RotateArray {
    static void rotate(int[] arr, int d) {
        int n =  arr.length;
        reverse(arr, 0, d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);

        for ( int ele : arr)  System.out.print(ele + " ");
    }

    static void reverse(int[] arr, int i,  int j) {
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void main() {
        int [] arr = {5, 9, 2, 5, 6, 1};
        rotate(arr, 3);
    }
}

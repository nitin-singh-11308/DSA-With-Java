package basic_sort;

public class BubbleSort {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void main() {
        int[] arr = {5,-2,5,7,0,7,9};
        int n = arr.length;
        printArray(arr);
        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        printArray(arr);
    }
}

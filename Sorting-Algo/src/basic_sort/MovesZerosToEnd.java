package basic_sort;

public class MovesZerosToEnd {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

   static void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int j = 0;
        for (int i = 0; i<n; i++) {
            if (arr[i] != 0) {
                if(i != j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    static void main() {
        int [] arr = {1, 2, 0, 0, 3, 9, 0, 5, 6};
        System.out.println("Original Array");
        printArray(arr);
        pushZerosToEnd(arr);
        System.out.println("Sorted Array");
        printArray(arr);
    }
}

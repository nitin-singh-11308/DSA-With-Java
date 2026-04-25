import java.util.Arrays;

public class ShortArrayBuiltIn {
    static void main() {
        int [] arr = {1 ,50, 9, 8, 8};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    static void print(int[] arr) {
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

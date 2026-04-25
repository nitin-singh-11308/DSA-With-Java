import java.util.Arrays;

public class ShallowCopyDeepCopy {
    static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int[] x = arr; // x is shallow copy of arr
        x[0] = 110;
        System.out.println(arr[0]);

        int[] y = Arrays.copyOf(arr, arr.length); //deep copy
        y[0] = 100;
        System.out.println(y[0]);
        System.out.println(arr[0]);
    }
}

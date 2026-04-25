import java.util.Scanner;

public class SecondMaxElement {
    static void main(String[] args) {

        int[] arr = {4,5,8,7,6,10,3,1,2};
        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i]>sMax && arr[i] != max) {
                sMax = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(sMax);

    }
}

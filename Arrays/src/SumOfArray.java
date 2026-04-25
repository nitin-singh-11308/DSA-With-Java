import java.util.Scanner;

public class SumOfArray {
    static void sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of Array elements by method : " + sum);
    }
    static void prodArray(int[] arr) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        System.out.println("Products of Array elements by method : " + product);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int prod = 1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            prod *= arr[i];
        }
        System.out.println("Sum of array elements : "+sum);
        System.out.println("Product of array elements : "+prod);
        sumArray(arr);
        prodArray(arr);
    }
}

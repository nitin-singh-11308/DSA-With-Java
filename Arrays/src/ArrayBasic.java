import java.util.Scanner;

public class ArrayBasic {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements of the array are : ");
        for (int i = 0; i< arr.length; i++) {
            System.out.println((arr[i]));
        }

        System.out.println("Only negative elements are : ");
        for (int i = 0; i< arr.length; i++) {
            if (arr[i]<0) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}

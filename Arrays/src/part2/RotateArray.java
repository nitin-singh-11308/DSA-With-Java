package part2;

import java.util.Scanner;

public class RotateArray {
    static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for (int i = n-k; i < n; i++) {
            ans[j++] = arr[i];
        }

        for (int i = 0; i < n-k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the "+ n +" elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be rotated");
        int k = sc.nextInt();

        System.out.println("original array");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        int[] ans = rotate(arr, k);
        System.out.println("\n Array after rotate");

        for (int an : ans) {
            System.out.print(an + " ");
        }
    }
}

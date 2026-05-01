package part2;

import java.util.Scanner;

public class PostfixSum {
    static void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
    static int[] makePostfixSum(int[] arr) {
        int n = arr.length;
        int[] post = new int[n];
        post[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            post[i] = post[i+1]+arr[i];
        }
        return post;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the " + n + " elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
       int[] post = makePostfixSum(arr);
        printArray(post);
    }
}

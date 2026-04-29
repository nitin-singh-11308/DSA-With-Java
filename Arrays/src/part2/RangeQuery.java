package part2;

import java.util.Scanner;

public class RangeQuery {
    static int[] makePrefixSum(int[] arr) {
        int n = arr.length;
        for (int i = 1; i<n; i++) {
            arr[i] +=  arr[i-1];
        }
        return arr;
    }

    static void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n+1];

        System.out.println("Enter the " + n + " elements of array");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        printArray(arr);

        int[] prefSum = makePrefixSum(arr);
        System.out.println("Enter number of queries ");
        int q = sc.nextInt();

        while (q-- >0) {
            System.out.println("Enter the range ");
            int l  = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefSum[r] -  prefSum[l-1];
            System.out.println("Sum " + ans);
        }
    }
}

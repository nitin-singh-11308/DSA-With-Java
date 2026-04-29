package part2;

import java.util.Scanner;

public class PrefixSum {

    static void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }

    static int[] makePrefixSum(int[] arr) {
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];
        for (int i = 1; i<n; i++) {
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
    }

//    method 2 inplace
    static int[] makePrefixSum2(int[] arr) {
        int n = arr.length;
        for (int i = 1; i<n; i++) {
            arr[i] =  arr[i-1] + arr[i];
        }
        return arr;
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
        printArray(arr);

        int[] pref = makePrefixSum(arr);
        printArray(pref);
        int[] prefixSum = makePrefixSum2(arr);
        printArray(prefixSum);
    }
}

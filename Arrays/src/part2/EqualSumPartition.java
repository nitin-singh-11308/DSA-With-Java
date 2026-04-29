package part2;

import java.util.Scanner;

public class EqualSumPartition {

    static int findArraySum(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }
    static boolean equalSumPartition(int[] arr) {
        int totalSum = findArraySum(arr);
        int prefSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];
            int suffixSum = totalSum - prefSum;
            if (suffixSum == prefSum) {
                return true;
            }
        }
        return false;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the " + n + " elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Equal Partition possible : "+equalSumPartition(arr));
    }
}

package part2;

import java.util.Scanner;

public class Triplets {
    static int triplets(int[] arr, int target) {
        int ans = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for  (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans ++;
                    }
                }
            }
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

        System.out.println("Enter the target sum");
        int target = sc.nextInt();

        System.out.println(triplets(arr, target));
    }
}

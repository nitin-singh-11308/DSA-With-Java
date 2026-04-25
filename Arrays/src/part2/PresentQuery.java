package part2;

import java.util.Scanner;

public class PresentQuery {

    static int[] makeFrequencyArray(int[] arr) {
        int[] freq = new int [100005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
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

        int[] freq = makeFrequencyArray(arr);

        System.out.println("Enter number of queries");
        int q = sc.nextInt();

        while (q > 0) {
            System.out.println("Enter the number to be searched ");
            int x = sc.nextInt();
            if(freq[x] > 0) System.out.println(x + " is present in the array");
            else System.out.println(x + " is not present in the array");
            q --;
        }
    }
}

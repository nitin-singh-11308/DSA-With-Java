package part2;

import java.util.Scanner;

public class FirstRepeat {
    static int repeatedNumber(int[] arr){
        int n  = arr.length;
        for (int i = 0; i < n; i++){
            for (int j = i+1 ; j < n; j++) {
                if (arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
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

        System.out.println("First repeated number : " + repeatedNumber(arr));
    }
}

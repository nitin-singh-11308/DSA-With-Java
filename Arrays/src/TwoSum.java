import java.util.Scanner;

public class TwoSum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = {25,46,7,-6,9,64,-51,67,26,42};

        for (int i = 0; i < arr.length; i++ ) {
            for (int j = i+1; j<arr.length; j++ ) {
                if (arr[i]+arr[j]==n){
                    System.out.println("Element found at index "+i+","+j);
                }
            }
        }
    }
}

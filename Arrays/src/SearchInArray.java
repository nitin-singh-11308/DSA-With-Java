import java.util.Scanner;

public class SearchInArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        int[] arr = {24,13,4,9,75,45,94,64};
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == n) {
                System.out.println("Element found at index " + (i));
                flag = true;
                break;
            }
        }
        if (!flag) System.out.println("Element not found");
    }
}

package part2;

public class isSorted {
    static void main() {
        int[] arr = {1,3,4,5,6,6,7};
        boolean flag = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<arr[i-1]) {
                flag = false;
                break;
            }
        }
        System.out.println("is sorted " + flag);
    }
}

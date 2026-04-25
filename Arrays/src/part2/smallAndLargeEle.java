package part2;

import java.util.Arrays;

public class smallAndLargeEle {

    static int[] smallestAndLarge(int[] arr) {
        Arrays.sort(arr);
        int[] ans = {arr[0],arr[arr.length-1]};
        return ans;
    }
    static void main(String[] args) {
        int[] arr = {2,4,1,5,2,6,7};

        int[] ans = smallestAndLarge(arr);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}

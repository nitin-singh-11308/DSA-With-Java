public class missingNum {
    static int missNum(int[] arr) {
        long n = arr.length+1;
        long sum  = n*(n+1)/2;
        long arraySum = 0;
        for (int ele : arr) {
            arraySum += ele;
        }
        int x = (int) (sum - arraySum);
        return x;
    }
    static void main() {
        int [] arr = {1,2,3,5};
        System.out.println(missNum(arr));
    }
}

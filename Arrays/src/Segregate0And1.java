public class Segregate0And1 {
//    Method 1
    static void segregate(int[] arr) {
        int numberOfZeros = 0;
        for( int ele : arr) {
            if(ele == 0) numberOfZeros++;
        }

        for (int i = 0; i < numberOfZeros; i++) {
            arr[i] = 0;
        }
        for (int i = numberOfZeros; i < arr.length; i++) {
            arr[i] = 1;
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

//    Method 2 -> Two Pointer
    static void segregate2(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] == 0) i++;
            if (arr[j] == 1) j--;
            if (i>j) break;
            if (arr[i] == 1 && arr[j] == 0) {
                int  temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    static void main() {
        int [] arr = {0, 0, 0, 1,1,0,0,1,1,1,1,0,1};
        segregate(arr);
        segregate2(arr);
    }
}

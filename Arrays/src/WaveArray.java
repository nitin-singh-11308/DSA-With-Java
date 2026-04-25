public class WaveArray {
    static void waveArr(int[] arr) {
        for (int i = 0; i < arr.length; i+=2) {
            if (i == arr.length-1) break;
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
    static void main() {
        int[] arr= {2,4,7,8,9,10};
        waveArr(arr);
    }
}

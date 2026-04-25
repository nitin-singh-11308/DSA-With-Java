public class ArrManipulation {
    static void main() {
        int[] arr = {5, 9,75,85,35,85,65};
        Manipulate(arr);
        print(arr);
    }

    static void Manipulate(int[] arr) {
        for (int i = 0; i< arr.length; i++) {
            if (i%2 == 0) arr[i] += 10;
            else arr[i] *= 2;
        }
    }

    static void print(int[] arr) {
        for (int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

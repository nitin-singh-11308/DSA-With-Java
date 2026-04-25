public class RevArray {
    static void rev(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    static void main() {
        int[] arr = {4,5,8,7,6,10,3,1,2};
//      two pointer variable
        rev(arr);

    }
}

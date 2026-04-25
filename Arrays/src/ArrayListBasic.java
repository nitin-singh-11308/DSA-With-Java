import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasic {
    static void main() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println(arr.get(2));
        arr.set(3,50);
        System.out.println(arr);

        int n= arr.size();
//        for(int i = 0; i<n; i ++) {
//            System.out.print(arr.get(i)+" ");
//        }
//        for (int ele : arr) {
//            System.out.print("\n"+ele+" ");
//        }

        arr.add(90);
        arr.add(3,40);
        System.out.println(arr);
        arr.remove(n-1);
        System.out.println(arr);
//        Collections.reverse(arr);
//        System.out.println(arr);

        // reverse array

        int i = 0, j = arr.size()-1;
        while(i<j) {
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.println(arr);
    }
}

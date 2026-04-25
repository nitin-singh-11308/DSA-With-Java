package part2;

public class lastIndex {
    static void main() {
        int [] arr = {1,2,3,4,1,2,1,4,5};
        int lastIndex = -1;
        int x = 4;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex = i;
            }
        }
        System.out.println(lastIndex);
    }
}

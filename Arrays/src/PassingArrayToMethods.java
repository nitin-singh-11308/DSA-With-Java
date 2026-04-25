public class PassingArrayToMethods {
    static void main() {
        int[] x = {11, 25, 83, 75, 99};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);

    }
    static void change(int[] y) {
        y[2] = 13;
    }
}

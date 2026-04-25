public class PassByValueAndReference {
    public static void change (int x) {
        x = 10;
    }
    static void main() {
        int x = 6;
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}

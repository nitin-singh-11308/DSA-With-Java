public class SwapTwoNumber {
    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+a+", b = "+b);
    }
    static void main() {
        int a = 10;
        int b = 20;
        swap(a,b);
    }
}

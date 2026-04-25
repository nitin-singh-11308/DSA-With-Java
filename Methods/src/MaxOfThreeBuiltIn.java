import java.util.Scanner;

public class MaxOfThreeBuiltIn {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(Math.max(a,Math.max(b,c)));
    }
}

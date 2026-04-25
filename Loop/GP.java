import java.util.Scanner;

public class GP {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 1, r=2;
        for (int i = 1; i<=n; i++) {
            System.out.println(a);
            a *= r;
        }
    }
}

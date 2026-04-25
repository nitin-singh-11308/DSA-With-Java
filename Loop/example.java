import java.util.Scanner;

public class example {
    static void main() {
        Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++) {
            System.out.println(i);
            System.out.println(n--);
        }

    }
}

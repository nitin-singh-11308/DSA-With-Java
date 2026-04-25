package square_rectangle;

import java.util.Scanner;

public class Number2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Enter b number");
        int m = sc.nextInt();

        for (int i = 1; i<= n; i++) {
            for (int j = 1; j<= m; j++) {
                System.out.print(i +" ");
            }
            System.out.println();
        }

    }
}

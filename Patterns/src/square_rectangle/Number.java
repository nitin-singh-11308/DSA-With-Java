package square_rectangle;

import java.util.Scanner;

public class Number {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Enter square_rectangle.Number of Rows");
        int n = sc.nextInt();

        IO.println("Enter square_rectangle.Number Columns");
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<= m; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}

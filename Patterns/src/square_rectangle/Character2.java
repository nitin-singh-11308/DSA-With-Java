package square_rectangle;

import java.util.Scanner;

public class Character2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Enter square_rectangle.Number of Rows");
        int n = sc.nextInt();

        IO.println("Enter square_rectangle.Number Columns");
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<= m; j++) {
                System.out.print((char)((i % 2 == 0 ? 64 : 96) + i) + " ");
            }
            System.out.println();
        }

//      Second Method
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j<= m; j++) {
//                if (i%2 == 1) System.out.print((char) (i+96)+" ");
//                else System.out.print((char) (i+64)+" ");
//            }
//            System.out.println();
//        }
    }
}

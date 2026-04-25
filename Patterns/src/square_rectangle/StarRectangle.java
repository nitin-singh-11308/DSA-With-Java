package square_rectangle;

import java.util.Scanner;

public class StarRectangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Enter square_rectangle.Number Of Rows : ");
        int row = sc.nextInt();
        IO.println("Enter square_rectangle.Number Of Columns : ");
        int col = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


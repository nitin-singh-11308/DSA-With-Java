package SpecialPattern;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DoubleFlippedTringle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i-1; j++ ) {
                System.out.print("  ");
            }
            for (int j = 1; j<=n+1-i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}

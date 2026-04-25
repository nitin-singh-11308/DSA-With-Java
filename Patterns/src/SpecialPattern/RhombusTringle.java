package SpecialPattern;

import java.util.Scanner;

public class RhombusTringle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j<=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

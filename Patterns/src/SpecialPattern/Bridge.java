package SpecialPattern;

import java.util.Scanner;

public class Bridge {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        for (int j = 1; j<=2*n+1; j++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {

            for (int j=1; j<=n+1-i; j++) {
                System.out.print("* ");
            }
            for (int k=1; k<=2*i-1; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=n+1-i; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

package tringle;

import java.util.Scanner;

public class IsoTriNum_Char {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(i % 2 == 0 ? (char) (64 + j) +" " : j + " ");
            }
            System.out.println();
        }
    }
}

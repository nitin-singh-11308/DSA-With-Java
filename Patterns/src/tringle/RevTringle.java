package tringle;

import java.util.Scanner;

public class RevTringle {
        static void main() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter The Number : ");
            int n = sc.nextInt();

            for (int i = 1; i<=n; i++) {
                for (int j = 1; j <= n+1-i; j++) {
                    System.out.print((char)(j+96) +" ");
                }
                System.out.println();
            }

//            Second Methods
//            for (int i = 1; i<=n; i++) {
//                for (int j = n; j >= i; j--) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }


//            third Methods
//            int a = n;  // number of star to be printed in each line
//            for (int i = 1; i<=n; i++) {
//                for (int j = 1; j<=a; j) {
//                    System.out.print("* ");
//                }
//                a--;
//                System.out.println();
//            }
        }
    }


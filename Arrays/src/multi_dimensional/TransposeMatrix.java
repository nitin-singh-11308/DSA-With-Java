package multi_dimensional;

import java.util.Scanner;

public class TransposeMatrix {
    static void printArray(int[][] arr) {
        for (int i = 0; i< arr.length; i++) {
            for (int j = 0; j< arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] findTranspose(int[][] matrix, int r, int c) {
        int[][] ans = new int[c][r];
        for(int i = 0; i<c; i++) {
            for(int j = 0; j<r; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }

    static void transposeInplace(int[][] matrix, int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows and column of matrix ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix =  new int[r][c];
        System.out.println("Enter matrix values");
        for (int i = 0; i<r; i++) {
            for (int j = 0; j<c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input matrix values");
        printArray(matrix);

        System.out.println("Transpose matrix values");
//        int[][] ans = findTranspose(matrix, r, c);
//        printArray(ans);

        transposeInplace(matrix, r, c);
        printArray(matrix);


    }
}

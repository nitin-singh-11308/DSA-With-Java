package multi_dimensional;

import java.util.Scanner;

public class PrintSpiral {

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printSpiralOrder(int[][] matrix, int r,  int c) {
        int topRow = 0, bottomRow = r-1, leftCol = 0, rightCol = c-1;
        int totalElement = 0;

        while (totalElement < r * c) {
//            topRow ->  leftCol to rightCol
            for(int j = leftCol; j <= rightCol && totalElement < r*c; j++) {
                System.out.print(matrix[topRow][j] + " ");
                totalElement++;
            }
            topRow++;

//            rightCol -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && totalElement < r*c; i++) {
                System.out.print(matrix[i][rightCol] + " ");
                totalElement++;
            }
            rightCol--;

//            bottomRow -> rightCol to leftCol
            for (int j = rightCol; j >= leftCol && totalElement < r*c; j--) {
                System.out.print(matrix[bottomRow][j] + " ");
                totalElement++;
            }
            bottomRow--;

//            leftCol -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && totalElement < r*c; i--) {
                System.out.print(matrix[i][leftCol] + " ");
                totalElement++;
            }
            leftCol++;
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows and column of matrix ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        int totalElements = r * c;

        System.out.println("Enter " + totalElements + " values");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input matrix values");
        printArray(matrix);

        printSpiralOrder(matrix, r, c);
    }
}

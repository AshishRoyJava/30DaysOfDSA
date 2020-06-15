package day2;

/*
Given a square matrix, turn it by 90 degrees in clockwise direction without using any extra space.

Input:
1 2 3
4 5 6
7 8 9
Output:
7 4 1
8 5 2
9 6 3
 */

public class IP12_RotateMatrix {

    public static void main(String[] args) {

        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        rotateMatrix(arr);

        for (int[] ints : arr) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static void rotateMatrix(int[][] arr) {

        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[n - 1 - j][i];
                arr[n - 1 - j][i] = arr[n - 1 - i][n - 1 - j];
                arr[n - 1 - i][n - 1 - j] = arr[j][n - 1 - i];
                arr[j][n - 1 - i] = temp;
            }
        }
    }
}

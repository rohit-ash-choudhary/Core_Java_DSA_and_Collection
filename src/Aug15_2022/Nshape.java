package Aug15_2022;

import java.util.Scanner;

public class Nshape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter the elements of matrix ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == 0 || j == m - 1) {
                    System.out.print(arr[i][j] + " ");
                } else if (i == j) {
                    System.out.print(arr[i][j] + " ");

                } else {
                    System.out.print("  ");

                }

            }
            System.out.println();
        }
    }

}
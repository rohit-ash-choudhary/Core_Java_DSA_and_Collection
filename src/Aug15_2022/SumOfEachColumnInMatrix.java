package Aug15_2022;

import java.util.Scanner;

public class SumOfEachColumnInMatrix {
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
        int k = 0;

        while (k < n) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {


                sum += arr[i][k];
            }
            System.out.println("rowise sum of elements " + sum);
            k++;
        }
    }
    }


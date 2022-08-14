package Aug15_2022;

import java.util.Scanner;

public class MinElementofEveryRow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        System.out.println("Enter the number of columns");
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        System.out.println("Enter the elements of matrix ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }

        }
        for (int i = 0; i < arr.length; i++) {
            int min=arr[i][0];
            for (int j = 1; j < arr[i].length; j++) {
                if(arr[i][j]<min)
                {
                    min=arr[i][j];
                }

            }
            System.out.println(min);
        }
    }
}

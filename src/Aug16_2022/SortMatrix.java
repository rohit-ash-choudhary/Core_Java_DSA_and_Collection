package Aug16_2022;

import java.util.Scanner;
import java.util.Arrays;

public class SortMatrix {
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
        int[] one_d=new int[n*m];
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                one_d[k]=arr[i][j];
                k++;
            }

        }
        Arrays.sort(one_d);
        int x=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(one_d[x]+" ");
                x++;

            }
            System.out.println();
        }
    }
}

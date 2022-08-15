package Aug15_2022;

import java.util.Scanner;

public class SwapRow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row number");
        int n=sc.nextInt();
        System.out.println("Enter column number");
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        System.out.println("Enter the element of Array");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the row you want to swap");
        int row1=sc.nextInt();
        System.out.println("Enter the row you want to swap");
        int row2=sc.nextInt();
        for (int i = 0; i < n; i++) {
            int temp=arr[row1-1][i];
            arr[row1-1][i]=arr[row2-1][i];
            arr[row2-1][i]=temp;
        }

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

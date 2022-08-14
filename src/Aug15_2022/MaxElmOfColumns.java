package Aug15_2022;

import java.util.Scanner;

public class MaxElmOfColumns {
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
        int k=0;
        while (k<m)
        {
            int max=arr[0][k];
            for (int i = 0; i <arr.length ; i++) {

                if(arr[i][k]>max)
                {
                    max=arr[i][k];
                }
            }
            System.out.println("max of column "+ max);
            k++;
        }

    }
}

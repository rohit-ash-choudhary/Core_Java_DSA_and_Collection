package Aug15_2022;

import java.util.Scanner;

public class SpareMatrixOrNot {
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
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]!=0)
                {
                    count++;
                }

            }
        }
        if(count<(n*m/2))
        {
            System.out.println("Spare Matrix");
        }
        else {
            System.out.println("Spare Matrix");
        }
    }
}

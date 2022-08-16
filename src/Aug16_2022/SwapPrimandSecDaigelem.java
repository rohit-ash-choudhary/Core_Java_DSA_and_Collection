package Aug16_2022;

import java.util.Scanner;

public class SwapPrimandSecDaigelem {
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
        int pi=-1;
        int pj=-1;
        int si=-1;
        int sj=-1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <=arr[i].length; j++) {
                if(i==j)
                {
                    pi=i;
                    pj=j;
                }
                if(i+j==n-1)
                {
                    si=i;
                    sj=j;
                }
            }
            int temp= arr[pi][pj];
            arr[pi][pj]=arr[si][sj];
            arr[si][sj]=temp;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

package Aug16_2022;

import java.util.Scanner;

public class RotateMatrixBy90Clockwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        System.out.println("Enter the number of columns");
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        int[][] arrt=new int[n][m];
        System.out.println("Enter the elements of matrix ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                //int temp=arr[i][j];
                arrt[i][j]=arr[j][i];
              // arr[j][i]=temp;
            }

        }

        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr.length; y++) {
                System.out.print(arrt[x][y]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < arrt.length; i++) {
            int j=0;
            int k=m-1;
            while(j<k){
                int temp=arrt[i][j];
                arrt[i][j]=arrt[i][k];
                arrt[i][k]=temp;
                j++;
                k--;
            }

        }
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr.length; y++) {
                System.out.print(arrt[x][y]+" ");
            }
            System.out.println();
        }


    }
}

package Aug5_2022;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=1;
        System.out.println("Enter the rows");
        int row=sc.nextInt();
        System.out.println("Enter the column");
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=c;
                c++;

            }

        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();

        }
    }
}

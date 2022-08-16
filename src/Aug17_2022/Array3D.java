package Aug17_2022;

import java.util.Scanner;

public class Array3D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number A");
        int a=sc.nextInt();
        System.out.println("Enter the number B");
        int b=sc.nextInt();
        System.out.println("Enter the number C");
        int c=sc.nextInt();
        int[][][] arr=new int[a][b][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k]=sc.nextInt();
                }

            }

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {

                    System.out.print(arr[i][j][k]+" ");

                }
                System.out.println("}");


            }
            System.out.print("}");


        }
    }
}

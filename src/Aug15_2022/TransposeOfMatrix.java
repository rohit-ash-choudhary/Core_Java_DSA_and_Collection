package Aug15_2022;

import java.util.*;

public class TransposeOfMatrix {
    public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] arr=new int[n][m];
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr[i].length;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(arr[j][i]+" ");
                }
                System.out.println();
            }

        }
    }


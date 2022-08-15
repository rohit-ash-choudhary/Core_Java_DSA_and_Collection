package Aug15_2022;

import java.util.Scanner;

public class SysmetricMartirx {
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
        int flag=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]!=arr[j][i])
                {
                    flag=1;
                    System.out.println("Not Sysmetric");
                    break;
                }
            }

        }
        if(flag==0)
        {
            System.out.println("Sysmetric matrix");
        }

    }
}

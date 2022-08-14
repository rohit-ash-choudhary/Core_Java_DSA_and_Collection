package Aug15_2022;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class AllZeroRightSide {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int j = 0; j < arr.length-1; j++) {
            if(arr[j]==0 && arr[j+1]!=0)
            {
                int temp;
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }

        }

    }
}

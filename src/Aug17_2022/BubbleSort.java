package Aug17_2022;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int len=sc.nextInt();
        int[] arr=new int[len];
        System.out.println("Enter the elem of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Sorted array is below");
        for (int i = 0; i < arr.length; i++) {
            int flag=0;
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }

            }
            if(flag==0)
            {
                break;
            }

        }
        for (int a:
             arr) {
            System.out.println(a);
        }
    }
}

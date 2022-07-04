package July4_2022;

import java.util.Scanner;

public class CheckArraySortedOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the element of array");
        for (int i = 0; i < arr.length; i++) {

            arr[i]=sc.nextInt();
        }
        int flag=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1]<arr[i])
            {
                System.out.println("No Array is not sorted");
                flag=1;
                break;
            }
        }
        if (flag==0)
        {
            System.out.println("Array is sorted");
        }
    }
}

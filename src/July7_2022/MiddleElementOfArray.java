package July7_2022;

import java.util.Scanner;

public class MiddleElementOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the element of array");
        int arr_len=arr.length;
        for (int i = 0; i < arr.length; i++) {

            arr[i]=sc.nextInt();
        }
        if(arr_len%2!=0)
        {
            System.out.println(arr[(arr.length)/2]);
        }
        else
         {
             System.out.println(arr[(arr_len/2)-1]);


        }


    }

}

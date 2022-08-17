package Aug17_2022;

import java.util.Scanner;

public class SelectionShort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int len=sc.nextInt();
        int[] arr=new int[len];
        System.out.println("Enter the elem of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Sorted array using selection sort");
        for (int i = 0; i < arr.length; i++) {
            int min=i;

            for (int j = i+1; j < arr.length; j++) {
                if(arr[min]>arr[j])
                {
                    min=j;
                }

            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;



        }
        for (int a:
             arr) {
            System.out.println(a);
        }

    }
}

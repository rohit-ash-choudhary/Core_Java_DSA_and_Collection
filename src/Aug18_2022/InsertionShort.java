package Aug18_2022;

import java.util.Scanner;

public class InsertionShort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the len of array");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the elem of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("sorted array by Insertion sort");
        for (int i = 0; i < arr.length; i++) {
            int temp=arr[i];
            int j=i;
            while (j>0 && arr[j-1]>temp)
            {
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;

        }
        for (int x: arr
             ) {
            System.out.println(x);
        }

    }
}

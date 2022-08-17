package Aug18_2022;

import java.util.Scanner;

public class MaxandMinInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int len=sc.nextInt();

        int[] arr=new int[len];
        System.out.println("Enter the element of String array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();


        }
        int max=arr[0];
        int min=arr[0];

        for (int i = 1; i < arr.length; i++) {

            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }

        }
        System.out.println("Maximum Element of Array "+ max);
        System.out.println("Maximum Element of Array "+ min);
    }
}

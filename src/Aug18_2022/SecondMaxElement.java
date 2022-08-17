package Aug18_2022;

import java.util.Scanner;

public class SecondMaxElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int len=sc.nextInt();

        int[] arr=new int[len];
        System.out.println("Enter the element of String array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();


        }
        int first_max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>first_max)
            {
                second_max=first_max;
                first_max=arr[i];
            } else if (arr[i]!=first_max && arr[i]>second_max) {
                second_max=arr[i];
            }

        }
        System.out.println(second_max);

    }
}

package Aug17_2022;

import java.util.Scanner;

public class PrintArrayInDifferentWay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int len=sc.nextInt();
        int[] arr=new int[len];
        System.out.println("Enter the element of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Using Foor Loop");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Using While Loop");
        int k=0;
        while (k<arr.length)
        {
            System.out.println(arr[k]);
            k++;
        }
        System.out.println("Using do-while loop");
        int x=0;
        do{
            System.out.println(arr[x]);
            x++;
        }
        while (x<arr.length);

        System.out.println("Using ForEach Loop");
        for (int a:
             arr) {
            System.out.println(a);
        }
    }
}

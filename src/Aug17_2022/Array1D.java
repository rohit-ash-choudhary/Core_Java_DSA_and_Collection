package Aug17_2022;

import jdk.jfr.Name;

import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int len=sc.nextInt();
        int[] arr=new int[len];
        for (int a:
            arr ) {
            System.out.println(a);
        }
        System.out.println("Enter the element of Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int x:arr
             ) {
            System.out.println(x);
        }
    }
}

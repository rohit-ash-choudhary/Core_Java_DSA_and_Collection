package July3_2022;

import java.util.Scanner;

public class AlternateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the element of array");
        for (int i = 0; i < arr.length; i++) {

            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length-1; i=i+2) {
            System.out.println(arr[i]);
        }
    }
}

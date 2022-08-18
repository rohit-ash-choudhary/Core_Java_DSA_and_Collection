package Aug19_2022;

import java.util.Scanner;

public class PrintEvenOddNumberInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int len=sc.nextInt();

        int[] arr=new int[len];
        System.out.println("Enter the element of String array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

        }
        int even_sum=0;
        System.out.println("These are the even numbers");
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]%2==0)
            {
                System.out.print(arr[i]+" ");
                even_sum+=arr[i];
            }

        }

        System.out.println();
        System.out.println("Even Sum "+ even_sum);
        System.out.println("These are the odd numbers");
        int odd_sum=0;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]%2!=0)
            {
                System.out.print(arr[i]+" ");
                odd_sum+=arr[i];
            }

        }
        System.out.println();
        System.out.println("Odd Sum "+odd_sum);
    }
}

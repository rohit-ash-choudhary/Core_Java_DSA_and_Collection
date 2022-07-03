package July3_2022;

import java.util.Scanner;

public class ArrayAvg
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the element of array");
        for (int i = 0; i < arr.length; i++) {

            arr[i]=sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum/arr.length);
    }
}

package Aug18_2022;

import java.util.Scanner;

public class SecondMinElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int len=sc.nextInt();

        int[] arr=new int[len];
        System.out.println("Enter the element of String array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int first_min=Integer.MAX_VALUE;
        int second_min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]<first_min)
            {
                second_min=first_min;
                first_min=arr[i];
            }
            else if(arr[i]!=first_min && arr[i]<second_min)
            {
                second_min=arr[i];
            }
        }
        System.out.println(first_min);
        System.out.println(second_min);
    }
}

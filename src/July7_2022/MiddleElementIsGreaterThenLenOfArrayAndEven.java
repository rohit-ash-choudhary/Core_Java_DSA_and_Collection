package July7_2022;

import java.util.Scanner;

public class MiddleElementIsGreaterThenLenOfArrayAndEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the element of array");
        int arr_len=arr.length;
        for (int i = 0; i < arr.length; i++) {

            arr[i]=sc.nextInt();
        }

        if (arr_len%2!=0) {
            if ((arr[(arr.length) / 2] > arr_len) && (arr[(arr.length) / 2] % 2 == 0)) {
                System.out.println("Find");
            }
            else {
                System.out.println("No Found");
            }
        }
        else
        {
            if ((arr[((arr.length) / 2)-1] > arr_len) && (arr[((arr.length) / 2)-1] % 2 == 0)) {
                System.out.println("Find");
            }
            else {
                System.out.println("No Found");
            }

        }


    }
}

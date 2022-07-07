package July7_2022;

import java.util.Scanner;

public class First_Positive_Number_of_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the element of array");
        for (int i = 0; i < arr.length; i++) {

            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=0)
            {
                System.out.println(arr[i]);
                System.out.println(i);
                break;
            }
        }
    }
}

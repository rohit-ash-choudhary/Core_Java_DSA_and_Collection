package Aug18_2022;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int len=sc.nextInt();
        System.out.println("Enter elements want to search");
        int target=sc.nextInt();
        int[] arr=new int[len];
        System.out.println("Enter the element of String array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();


        }
        boolean flag=false;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target)
            {
                flag=true;
                System.out.println("Element find at index + "+ i);
                break;
            }
        }
        if (!flag)
        {
            System.out.println("Element not present in array");
        }
    }
}

package Aug18_2022;

import java.util.Scanner;

public class BinarySearch {
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
        int intial_index=0;
        int last_index=arr.length-1;
        while (intial_index<=last_index)
        {
            int mid=(intial_index+last_index)/2;
            if(arr[mid]==target)
            {
                System.out.println("element find at index + "+mid );
                break;
            }
            else if(target>arr[mid])
            {
                intial_index=mid+1;
            } else {
                last_index=mid-1;
            }
        }
    }
}

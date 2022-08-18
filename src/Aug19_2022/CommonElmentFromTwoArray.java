package Aug19_2022;

import java.util.Scanner;

public class CommonElmentFromTwoArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int len=sc.nextInt();

        int[] arr=new int[len];
        System.out.println("Enter the element of String array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

        }


        System.out.println("Enter the len of array");
        int len2=sc.nextInt();

        int[] arr2=new int[len2];
        System.out.println("Enter the element of String array");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=sc.nextInt();

        }
        System.out.println("These are the common elements from both array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {

                if(arr[i]==arr2[j])
                {
                    System.out.print(arr[i]+" ");
                }
            }

        }
    }
}

package Aug19_2022;

import java.util.HashSet;
import java.util.Scanner;

public class FirstDuplpcateHashset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int len=sc.nextInt();

        int[] arr=new int[len];
        System.out.println("Enter the element of String array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

        }
        int temp=-1;
        HashSet<Integer> values=new HashSet<>();
        for (int i = arr.length-1; i>=0 ; i--)

        {
            if(values.contains(arr[i]))
            {
                temp=i;
            }
            else {
                values.add(arr[i]);
            }

        }
        System.out.println("First Duplicate element is : "+arr[temp]);
    }
}

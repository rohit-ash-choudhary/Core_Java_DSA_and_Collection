package Aug19_2022;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FirstDuplicateSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int len=sc.nextInt();

        int[] arr=new int[len];
        System.out.println("Enter the element of String array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

        }
        Set<Integer> values=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(!values.add(arr[i]))
            {
                System.out.println("This is first duplicate element : "+ arr[i]);
                break;
            }

        }

        }
    }



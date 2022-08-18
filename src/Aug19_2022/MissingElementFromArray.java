package Aug19_2022;

import java.util.Scanner;

public class MissingElementFromArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int len=sc.nextInt();

        int[] arr=new int[len];
        System.out.println("Enter the element of String array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

        }
        int sum_total=((arr.length+1)*(arr.length+2))/2;
        int array_sum=0;
        for (int i = 0; i < arr.length; i++) {
            array_sum+=arr[i];
        }
        System.out.println(sum_total-array_sum);
    }
}

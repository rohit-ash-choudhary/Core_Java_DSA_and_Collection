package Aug19_2022;

import java.util.Scanner;

public class MissingElem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int len=sc.nextInt();

        int[] arr=new int[len];
        System.out.println("Enter the element of String array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

        }
        int xor1=0;

        for (int i = 0; i < arr.length; i++) {
                xor1^=arr[i];
        }
        int xor2=0;
        for (int i = 1; i < arr.length+2; i++) {
            xor2^=i;
        }
        System.out.println(xor1^xor2);
    }
}

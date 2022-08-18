package Aug19_2022;

import java.util.Scanner;

public class SingleAppreanceVsTwice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int len=sc.nextInt();

        int[] arr=new int[len];
        System.out.println("Enter the element of String array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

        }
        int xor=0;
        for (int i = 0; i < arr.length; i++) {
            xor^=arr[i];

        }
        System.out.println("Element Single time in array : "+ xor);
    }
}

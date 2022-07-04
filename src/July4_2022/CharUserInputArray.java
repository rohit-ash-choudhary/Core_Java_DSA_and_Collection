package July4_2022;

import java.util.Scanner;

public class CharUserInputArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int num=sc.nextInt();
        sc.nextLine();
        char[] arr=new char[num];
        System.out.println("enter the char");

        for (int i = 0; i < arr.length; i++) {
            /*String s=sc.nextLine();
            arr[i]=s.charAt(0); */
            arr[i]=sc.nextLine().charAt(0);  //Important


        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}

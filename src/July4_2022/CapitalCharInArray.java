package July4_2022;

import java.util.Scanner;

public class CapitalCharInArray {
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
            arr[i]=sc.nextLine().charAt(0);


        }

        int cnt_large=0;
        int cnt_small=0;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>'A' && arr[i]<'Z')
            {
                cnt_large++;
            }
            else{
                cnt_small++;
            }
        }
        System.out.println("Upper Case "+ cnt_large);
        System.out.println("Lower Case Case "+ cnt_small);
    }
}

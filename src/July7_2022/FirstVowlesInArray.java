package July7_2022;

import java.util.Scanner;

public class FirstVowlesInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int num=sc.nextInt();
        sc.nextLine();
        char[] arr=new char[num];
        System.out.println("Enter the element of array");
        int arr_len=arr.length;
        for (int i = 0; i < arr.length; i++) {

            arr[i]=sc.nextLine().charAt(0);
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='o')
            {
                System.out.println(arr[i]);
                break;
            }
            else
            {
                System.out.println("No Found");
            }

        }

    }
}

package Aug18_2022;

import java.util.Scanner;

public class StringSortingInJava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int len=sc.nextInt();
        String[] arr=new String[len];
        System.out.println("Enter the element of String array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextLine();


        }
        System.out.println("Sorted String array");
        for (int i = 0; i < arr.length; i++) {
            boolean flag=false;
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j].compareTo(arr[j+1])>0)
                {
                    flag=true;
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
            if(!flag)
            {
                break;
            }

        }
        for (String a: arr
             ) {
            System.out.println(a);
        }
    }
}

package Random_Problem;

import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array len");
        int len=sc.nextInt();
        int[] arr=new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = arr.length-1; i>-1 ; i--) {
            System.out.println(arr[i]);
        }
    }
}

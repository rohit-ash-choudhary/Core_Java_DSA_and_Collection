package July2_2022;
import  java.util.*;
public class MinMaxElem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int arr_len=sc.nextInt();
        int[] arr=new int[arr_len];
        System.out.println("Enter the element of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int sum_of_array=0;
        for (int i = 0; i < arr.length; i++) {
            sum_of_array+=arr[i];
        }
        double average_of_array=sum_of_array/arr.length;
        System.out.println("Sum of array :"+ sum_of_array);
        System.out.println("Average of array  "+ average_of_array);
    }
}

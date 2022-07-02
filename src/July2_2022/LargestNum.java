package July2_2022;
import java.util.*;
public class LargestNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int arr_len= sc.nextInt();
        int[] arr=new int[arr_len];
        System.out.println("Enter the elements of array");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        int largest_elem=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>largest_elem)
            {
                largest_elem=arr[i];
            }
        }
        System.out.println("Largest number is "+ largest_elem);
    }
}

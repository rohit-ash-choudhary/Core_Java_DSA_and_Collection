package July7_2022;
import java.util.*;
public class ArrayOrderInDescendingOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the element of array");
        int arr_len=arr.length;
        for (int i = 0; i < arr.length; i++) {

            arr[i]=sc.nextInt();
        }
        int flag=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<arr[i+1])
            {
                flag=1;
                System.out.println("Not Sorted");
                break;
            }


        }
        if(flag==0)
        {
            System.out.println("Sorted");
        }
    }
}

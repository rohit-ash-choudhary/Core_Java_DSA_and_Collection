package July27_2022;
import java.util.*;
public class MergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int num=sc.nextInt();
        int[] arr_one=new int[num];
        System.out.println("Enter the element of array");
        for (int i = 0; i < arr_one.length; i++) {
            arr_one[i]=sc.nextInt();
        }
        System.out.println("Enter the len of array");
        int num_two=sc.nextInt();
        int[] arr_two=new int[num_two];
        System.out.println("Enter the element of array");
        for (int j = 0; j < arr_two.length; j++) {
            arr_two[j]=sc.nextInt();
        }

        int[] sorted_array=new int[arr_one.length+arr_two.length];
        //System.out.println(sorted_array.length);
        int x=0;
        int y=0;
        int z=0;
        while(x<arr_one.length && y<arr_two.length)
        {
            if(arr_one[x]<arr_two[y])
            {
                sorted_array[z]=arr_one[x];
                x++;
                z++;
            }
            else {
                sorted_array[z]=arr_two[y];
                y++;
                z++;
            }
        }
        while(x<arr_one.length)
        {
            sorted_array[z]=arr_one[x];
            x++;
            z++;
        }
        while(y<arr_two.length)
        {
            sorted_array[z]=arr_two[y];
            z++;
            y++;
        }

        for (int k: sorted_array) {
            System.out.println(k);
        }

    }
}

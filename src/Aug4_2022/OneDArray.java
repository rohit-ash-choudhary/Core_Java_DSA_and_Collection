package Aug4_2022;
import java.util.*;
public class OneDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int len=sc.nextInt();
        int[] arr=new int[len];
        System.out.println("Enter the element of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

        }
        for (int i: arr
             ) {
            System.out.println(i);
        }
    }

}

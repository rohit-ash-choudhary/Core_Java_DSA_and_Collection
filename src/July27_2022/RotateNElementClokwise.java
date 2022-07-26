package July27_2022;
import java.util.*;
public class RotateNElementClokwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number how much you want to rotate rightwise ");
        int n=sc.nextInt();
        System.out.println("Enter the len of array");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the Array Elements");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        int[] rotated_array=new int[num];
        int k=0;
        for (int i = num-n; i <arr.length; i++) {
            rotated_array[k]=arr[i];
            k++;

        }
        for (int j = 0; j < num-n; j++) {
            rotated_array[k]=arr[j];
            k++;
        }

        for (int xy: rotated_array
             ) {
            System.out.println(xy);
        }

    }
}

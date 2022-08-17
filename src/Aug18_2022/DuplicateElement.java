package Aug18_2022;
/*
Using Set

 */
import java.util.*;

public class DuplicateElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int len=sc.nextInt();

        int[] arr=new int[len];
        System.out.println("Enter the element of String array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();


        }
        Set <Integer> values=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(!values.add(arr[i])){
                System.out.println(arr[i]);
            }

        }
    }
}

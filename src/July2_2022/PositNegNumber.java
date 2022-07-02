package July2_2022;
import java.util.*;
public class PositNegNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int arr_len= sc.nextInt();
        int[] arr=new int[arr_len];
        System.out.println("Enter the elements of array");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        int even_number=0;
        int odd_number=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0)
            {
                even_number+=1;
            }
            else {
                odd_number+=1;
            }

        }
        System.out.println("Even number "+ even_number);
        System.out.println("Odd number "+ odd_number);
    }
}

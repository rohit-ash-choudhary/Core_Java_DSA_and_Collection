package July3_2022;
import java.util.*;
public class SearchNumberInArray {

    public static void main(String[] args) {
        int flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter Number");
        int number= sc.nextInt();
        System.out.println("Enter the element of array");
        for (int i = 0; i < arr.length; i++) {

            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]==number)
            {
                System.out.println("Number is present & Break");
                System.out.println(number);
                flag=1;
                break;
            }
        }
        if (flag==0)
        {
            System.out.println("Not Present");
        }
    }
}

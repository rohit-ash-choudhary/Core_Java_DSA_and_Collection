package July7_2022;
import java.util.*;
public class First_PositiveandNegitiveNumberOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of array");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the element of array");
        for (int i = 0; i < arr.length; i++) {

            arr[i]=sc.nextInt();
        }
        int first_negtive=0;
        int first_positive=0;
        int pcnt=0;
        int ncnt=0;
        int cnt=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=0 && pcnt<1)
            {
                first_positive=arr[i];
                System.out.println(arr[i]);
                cnt++;
                pcnt++;

            } if (arr[i]<0 && ncnt<1)  {


                System.out.println(arr[i]);
                cnt++;
                ncnt++;

            }
            if(cnt==2)
            {
               break;
            }

        }
    }
}

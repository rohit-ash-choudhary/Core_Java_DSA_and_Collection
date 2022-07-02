package July3_2022;
import java.util.*;
public class HowManyElement {
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
        int cntg=0;
        int cntl=0;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>number)
            {
               cntg+=1;
            } else if (arr[i]<number) {
                cntl+=1;
            }
        }
        System.out.println("the elments greater then "+number +" "+ "is " + cntg);
        System.out.println("the elments less then "+number +" "+ "is " + cntl);
    }
}

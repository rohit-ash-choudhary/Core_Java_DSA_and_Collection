package Aug4_2022;

import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int temp=num;
        int ams_num=num;
        int len=0;
        int total=0;
        int rem;
        while (num>0)
        {
            num=num/10;
            len++;
        }
        System.out.println(len);
        while (temp>0)
        {
            rem=temp%10;
            int k=1;
            for (int i = 0; i < len; i++) {
                k=k*rem;

            }
            total=total+k;
            temp=temp/10;
        }
        System.out.println(total);

        if(total == ams_num)
        {
            System.out.println("Yes Number is amstrong");
        }
        else {
            System.out.println("Number is not amstrong");
        }
    }
}

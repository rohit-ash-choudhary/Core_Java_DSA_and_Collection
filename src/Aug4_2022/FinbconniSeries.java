package Aug4_2022;

import java.util.Scanner;

public class FinbconniSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int a=0;
        int b=1;
        if(num==0)
        {
            System.out.println("Inter valid input");
        } else if (num==1) {
            System.out.println(a);

        } else if (num==1) {

            System.out.println(a);
            System.out.println(b);
        }
        else {
            System.out.println(a);
            System.out.println(b);
            int c;
            for (int i = 0; i < num-2; i++) {
                c=a+b;
                System.out.println(c);
                a=b;
                b=c;



            }
        }
    }
}

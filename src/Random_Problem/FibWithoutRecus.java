package Random_Problem;

import java.util.Scanner;

public class FibWithoutRecus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int a=0;
        int b=1;
        int c;
        if (num==1)
        {
            System.out.println(a);
        }
        if(num==2)
        {
            System.out.println(a);
            System.out.println(b);
        }
        else {
            System.out.println(a);
            System.out.println(b);
            for (int i = 2; i < num; i++) {


            c=a+b;
            System.out.println(c);
            a=b;
            b=c;

            }


        }
    }
}

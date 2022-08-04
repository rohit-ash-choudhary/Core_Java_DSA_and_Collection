package Random_Problem;

import java.util.Scanner;

public class FibusingRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        FibusingRecursion obj=new FibusingRecursion();
        int num=sc.nextInt();
        obj.fib(num);
    }
    int a=0;
    int b=1;
    public void fib(int m)
    {

        while (m>=1)
        {
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            fib(m-1);
        }
    }
}

package Aug4_2022;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int fac=1;
        while(num>0)
        {
            fac=fac*num;
            num--;
        }
        System.out.println(fac);
    }
}

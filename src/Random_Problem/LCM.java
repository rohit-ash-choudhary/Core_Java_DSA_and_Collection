package Random_Problem;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first num1");
        int num1=sc.nextInt();
        System.out.println("Enter the second num2");
        int num2=sc.nextInt();
        int div;
        if(num1>num2)
        {
            div=num1;
        }
        else {
            div=num2;
        }
        while (true)
        {
            if(div%num1==0 && div%num2==0)
            {
                System.out.println(div);
                break;
            }
            div++;
        }

    }
}

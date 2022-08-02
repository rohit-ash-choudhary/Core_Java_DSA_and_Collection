package Random_Problem;
import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int num1=sc.nextInt();
        System.out.println("enter second number");
        int num2=sc.nextInt();
        int d;
        if(num1>num2)
        {
            d=num2;
            while (d>2)
            {
                if(num1%d==0 && num2%d==0)
                {
                    System.out.println(d);
                    break;

                }
                d--;
            }
        }
        else
        {
            d=num1;

            while (d>0)
            {
                if(num1%d==0 && num2%d==0)
                {
                    System.out.println(d);
                    break;

                }
                d--;
            }
        }

    }
}

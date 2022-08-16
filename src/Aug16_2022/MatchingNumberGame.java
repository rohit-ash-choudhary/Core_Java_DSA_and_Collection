package Aug16_2022;

import java.util.Scanner;

public class MatchingNumberGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        boolean gauues=true;
        while (gauues)
        {
            System.out.println("enter the gauess number");
            int nu=sc.nextInt();
            if(nu==num)
            {
                System.out.println("Correct number");
                gauues=false;
                break;
            }
            else{
                System.out.println("Gauess Number again ");
            }

        }

    }

}

package Aug4_2022;

import java.util.Scanner;

public class PatternSix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j<num; j++) {
                if(i==j)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            for (int k = num; k >0; k--) {
                if(i==k)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }


            System.out.println();



            }
    }
}

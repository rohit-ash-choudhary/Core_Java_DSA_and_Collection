package Aug4_2022;

import java.util.Scanner;

public class PatternSeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <=num ; j++) {
                if(j>1 && j<5 && i>1 && i<5)
                {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}

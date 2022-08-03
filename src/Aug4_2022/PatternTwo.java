package Aug4_2022;

import java.util.*;

public class PatternTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 1; j < num-i; j++) {
                System.out.print(" ");

            }
            for (int k = 0; k<=i; k++) {
                System.out.print("*");

            }

            System.out.println();

        }
        for (int i =1; i <num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            for (int l = i; l < num; l++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}

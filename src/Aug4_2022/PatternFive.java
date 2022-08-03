package Aug4_2022;
import java.util.*;
public class PatternFive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            for (int l = i; l < num; l++) {
                System.out.print("*");
            }
            for (int m = 0; m < num-i; m++) {
                System.out.print("*");
            }
            for (int z = num-i; z < num; z++) {
                System.out.print(" ");
            }
            System.out.println();
            }
    }
}

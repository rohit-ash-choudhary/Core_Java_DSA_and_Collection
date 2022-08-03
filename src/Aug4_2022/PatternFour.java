package Aug4_2022;
import java.util.*;
public class PatternFour {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 1; j < num-i; j++) {
                System.out.print(" ");

            }
            for (int k =num-i; k < num; k++) {
                System.out.print("*");
            }
            for (int l = 1; l < i; l++) {
                System.out.print("*");
            }
            System.out.println();

            }
    }
}

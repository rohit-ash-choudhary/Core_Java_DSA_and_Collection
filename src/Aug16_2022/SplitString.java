package Aug16_2022;

import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] s = str.split(" ");
        for (String a: s
             ) {
            System.out.println(a);
        }

    }
}

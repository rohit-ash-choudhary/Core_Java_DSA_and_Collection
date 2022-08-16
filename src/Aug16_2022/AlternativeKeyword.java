package Aug16_2022;

import java.util.Scanner;

public class AlternativeKeyword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for (int i = 0; i < str.length(); i+=2) {
            System.out.println(str.charAt(i));
        }
    }
}

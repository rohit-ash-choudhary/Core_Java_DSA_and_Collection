package Aug16_2022;

import java.util.Scanner;

public class PrintReverseofString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] s = str.split(" ");
        String str_new=" ";
        for (int i = 0; i < s.length; i++) {
            String rev_str="";
            for (int j = s[i].length()-1; j>=0; j--) {

                rev_str+=s[i].charAt(j);
            }
            str_new+=rev_str+" ";



        }
        System.out.println(str_new);
    }
}

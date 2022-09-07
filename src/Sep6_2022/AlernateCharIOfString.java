package Sep6_2022;

import java.util.Scanner;

public class AlernateCharIOfString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string");
        String s1=sc.nextLine();
        System.out.println("Enter the second string");
        String s2=sc.nextLine();
        int i=0,j=0;
        String str_final="";

        while (i<s1.length() && j<s2.length()) {
            str_final += s1.charAt(i);
            i++;
            str_final +=s2.charAt(j);
            j++;
        }
        while (i<s1.length())
        {
            str_final += s1.charAt(i);
            i++;
        }
        while (j<s2.length())
        {
            str_final +=s2.charAt(j);
            j++;
        }
        System.out.println(str_final);
    }
}

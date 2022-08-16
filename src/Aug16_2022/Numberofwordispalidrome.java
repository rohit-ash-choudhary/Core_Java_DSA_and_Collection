package Aug16_2022;

import java.util.Scanner;

public class Numberofwordispalidrome {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] s = str.split(" ");
        String str_new=" ";
        int cnt=0;
        for (int i = 0; i < s.length; i++) {
            String rev_str = "";
            for (int j = s[i].length() - 1; j >= 0; j--) {

                rev_str += s[i].charAt(j);
            }
            if(rev_str.equals(s[i]))
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

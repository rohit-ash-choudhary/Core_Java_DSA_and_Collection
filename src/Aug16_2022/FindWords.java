package Aug16_2022;

import java.util.Scanner;

public class FindWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");

        String str=sc.nextLine();
        System.out.println("Enter the world that you find & frequensy");
        System.out.println();
        String find=sc.nextLine();
        String[] s=str.split(" ");
        int cnt=0;
        int cnti=0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals(find))
            {
                cnt++;
            }
            if(s[i].contains(find))
            {
                cnti++;
            }

        }
        System.out.println(cnt);
        System.out.println(cnti);
    }
}

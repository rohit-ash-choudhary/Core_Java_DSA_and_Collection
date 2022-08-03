package Random_Problem;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        String str=sc.nextLine();
        String str_rev="";
        for (int i = str.length()-1; i>-1; i--) {
            str_rev+=str.charAt(i);

        }
        System.out.println(str_rev);
    }
}

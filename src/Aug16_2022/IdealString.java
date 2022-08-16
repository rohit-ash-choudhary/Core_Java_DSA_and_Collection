package Aug16_2022;

import java.util.Scanner;

public class IdealString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        boolean isIdeal=true;
        int cnt=0;
        if(str.length()>1)
        {
            for (int i = 0; i < str.length()-1; i++) {
                if(Character.isUpperCase(str.charAt(i)))
                {
                    cnt++;


                }

            }
            if (str.length()-cnt!=str.length()-1)
            {
                isIdeal=false;
            }


        }

        else{
            System.out.println("Not Ideal String");

        }
        if(isIdeal)
        {
            System.out.println("Ideal String");
        }
        else {
            System.out.println("Not Ideal String");
        }
    }
}

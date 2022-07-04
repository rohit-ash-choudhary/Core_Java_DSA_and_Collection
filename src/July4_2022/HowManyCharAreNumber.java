package July4_2022;

import java.util.Scanner;

public class HowManyCharAreNumber {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the len of char array");
        int num=sc.nextInt();
        sc.nextLine();
        char[] arr=new char[num];
        System.out.println("Enter the char");
        for (int i = 0; i < arr.length; i++) {
            String s=sc.nextLine();
            arr[i]=s.charAt(0);
        }
        int cnt_num=0;
        for (int i = 0; i <arr.length ; i++) {
            if((int)arr[i]>='0' && (int)arr[i]<='9') //((int)arr[i]>=48 && (int)arr[i]<=57)
                /* beacuse '0' value in int is 48 */
            {
                cnt_num+=1;

            }
        }
        System.out.println(cnt_num);

    }
}


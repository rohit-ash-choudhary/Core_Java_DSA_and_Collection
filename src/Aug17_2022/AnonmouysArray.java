package Aug17_2022;

import java.util.Scanner;

public class AnonmouysArray {
    public static void main(String[] args) {


        AnonmouysArray obj=new AnonmouysArray();
        obj.sum(new int[]{5,5,5,5,5,5});





    }
    public  void sum(int no[])
    {
        int total=0;
        for (int a:
             no) {
            total+=a;

        }
        System.out.println(total);

    }
}

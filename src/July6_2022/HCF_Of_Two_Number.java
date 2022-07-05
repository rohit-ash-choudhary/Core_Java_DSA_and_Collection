package July6_2022;

import java.util.Scanner;

public class HCF_Of_Two_Number {
    Scanner sc = new Scanner(System.in);

    int num1 = sc.nextInt();

    int num2 = sc.nextInt();
    int lowest_num;

    public static void main(String[] args) {
        HCF_Of_Two_Number obj=new HCF_Of_Two_Number();
         obj.lowest_num=obj.lowestNum(obj.num1,obj.num2);
        System.out.println(obj.findHCF(obj.num1,obj.num2));


    }

    public int lowestNum(int num1 , int num2)
    {

        if(num1 >num2) {
            lowest_num = num2;

            return lowest_num;

        } else {
            lowest_num = num1;

            return lowest_num;

        }
    }
    public int findHCF(int a,int b)
    {
        int hcf = 0;
        for (int i = 1; i < lowest_num+1; i++) {
            if(a%i==0 && b%i==0)
            {
                hcf=i;
            }

        }
        return hcf;
    }
}

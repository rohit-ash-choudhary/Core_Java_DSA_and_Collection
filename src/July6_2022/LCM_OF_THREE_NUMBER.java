package July6_2022;
import java.util.*;
public class LCM_OF_THREE_NUMBER {
    Scanner sc = new Scanner(System.in);

    int num1 = sc.nextInt();

    int num2 = sc.nextInt();

    int num3 = sc.nextInt();
    int greatest_num;
    int value;
    public static void main(String[] args) {



        LCM_OF_THREE_NUMBER obj = new LCM_OF_THREE_NUMBER();
        int number = obj.greatsNum(obj.num1, obj.num2, obj.num3);
        System.out.println(number);
        obj.greatest_num=number;
        obj.value= obj.greatest_num;
        System.out.println(obj.findLCM(obj.num1, obj.num2, obj.num3));


    }

    public int findLCM(int a, int b, int c) {
        while (true) {
            if (greatest_num % a == 0 && greatest_num % b == 0 && greatest_num % c == 0) {
                return greatest_num;
            }
            greatest_num += value;

        }
    }
        public int greatsNum(int a, int b, int c)
        {

            if (num1 > num2 && num1 > num2) {
                greatest_num = num1;

                return greatest_num;
            } else if (num2 > num3 && num2 > num3) {
                greatest_num = num2;

                return greatest_num;
            } else {
                greatest_num = num3;

                return greatest_num;

            }
        }


}

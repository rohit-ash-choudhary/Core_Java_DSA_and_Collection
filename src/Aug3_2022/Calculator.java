package Aug3_2022;
import java.util.*;
public class Calculator {
    static int res;
    static int num1;
    static int num2;


    public static void main(String[] args) {

        Calculator obj = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the symbol");
        String sy = sc.nextLine();

        System.out.println("Enter first num1");
        int num1 = sc.nextInt();
        System.out.println("Enter Second num2");
        int num2 = sc.nextInt();
        System.out.println(obj.cal(sy));
    }

    public int cal(String sy) {
        switch (sy) {
            case "+":
                res = num1 + num2;
                return res;

            case "-":
                res = num1 - num2;
                return res;

            case "*":
                res = num1 * num2;
                return res;

            case "%":
                res = num1 % num2;
                return res;

          //  default: return 0;


        }
        return res;

    }
}


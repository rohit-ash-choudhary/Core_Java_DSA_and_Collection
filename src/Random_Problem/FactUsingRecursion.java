package Random_Problem;

import java.util.Scanner;

public class FactUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        FactUsingRecursion obj = new FactUsingRecursion();
        int num = sc.nextInt();
        System.out.println(obj.fact(num));

    }

    public int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }

    }
}




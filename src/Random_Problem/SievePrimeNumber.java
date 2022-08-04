package Random_Problem;

import java.util.Scanner;

public class SievePrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Check Prime number till number");
        int num=sc.nextInt();
        boolean[] prime=new boolean[num+1];
        for (int i = 2; i < num+1; i++) {
            prime[i]=true;

        }
        for (int p = 2; p <Math.sqrt(num) ; p++) {
            if(prime[p]){
                for (int j = p; j*p <num ; j++) {
                    prime[j*p]=false;

                }
            }


        }
        for (int i = 2; i < num; i++) {
            if(prime[i])
            {
                System.out.println(i);
            }

        }

    }
}

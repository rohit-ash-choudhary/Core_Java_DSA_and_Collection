package Aug3_2022;

import java.util.Scanner;

public class InstanceVariable {
    int a=34; //instance
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        InstanceVariable obj=new InstanceVariable();
        int res=obj.add(obj.a);
        System.out.println(res);

    }
    public int add(int k)
    {
        int a=23;
        return k+a;

    }
}

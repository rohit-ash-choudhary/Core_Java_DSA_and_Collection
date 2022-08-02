package Aug3_2022;
import java.util.*;
public class DataTypes {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=sc.nextLine();
        System.out.println("Enter the age");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println(" Enter the Gender");
        char gender=sc.nextLine().charAt(0);
        System.out.println("Enter the phone number");
        long number = sc.nextLong();
        System.out.println("Enter the weight");
        float weight=sc.nextFloat();
        System.out.println("Enter the Probablity to today rain");
        boolean rn;
        if (sc.nextBoolean()) rn = true;
        else rn = false;


        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(number);
        System.out.println(weight);
        System.out.println(rn);


    }
}

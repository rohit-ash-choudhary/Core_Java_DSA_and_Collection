import java.util.Scanner;

public class Aug1_2022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char");
        char s = sc.next().charAt(0);
        sc.nextLine();
        System.out.println("Enter the string");
        String str=sc.nextLine();

        int cont=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==s)
            {
              cont++;
            }

        }
        System.out.println(cont);



    }
}

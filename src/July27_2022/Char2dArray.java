package July27_2022;
import java.util.*;
public class Char2dArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows & Cplumn Size");
        int row_col= sc.nextInt();
        char[][] arr=new char[row_col][row_col];
        char a='A';
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               // System.out.print(++a +" ");
                System.out.print(a++ +" ");
            }
            System.out.println();

        }
    }
}

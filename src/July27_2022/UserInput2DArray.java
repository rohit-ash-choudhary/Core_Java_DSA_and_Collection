package July27_2022;
import java.util.*;
public class UserInput2DArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows size");
        int r=sc.nextInt();
        System.out.println("Enter the colum size");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();

            }

        }

        System.out.println("Print of Elements");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);

            }

        }

    }
}

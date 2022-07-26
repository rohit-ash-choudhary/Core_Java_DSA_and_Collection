package July27_2022;
import java.util.*;
public class Basic2dArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr={{4,5,76,9},{3,6,8,7},{23,65,7,89}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);

            }
        }

    }
}

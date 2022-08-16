package Aug16_2022;
import java.nio.charset.StandardCharsets;
import java.util.*;
public class StringDemo {
    public static void main(String[] args) {
        String s="Rohit";
        System.out.println(s.length());

        char[] c=s.toCharArray();
        for (char i: c
             ) {
            System.out.println(i);
        }
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}

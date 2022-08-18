package Aug17_2022;
import java.util.regex.*;
public class PatternMatcher {
    public static void main(String[] args) {
        String value="";
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        value= pattern.matcher("Visit W3Schools!").replaceAll("");
        System.out.println(value);

    }
}

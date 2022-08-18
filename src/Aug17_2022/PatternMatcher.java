package Aug17_2022;
import java.util.regex.*;
public class PatternMatcher {
    public static void main(String[] args) {
        /*String value="";
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        value= pattern.matcher("Visit W3Schools!").replaceAll("");
        System.out.println(value);*/
        PatternMatcher obj=new PatternMatcher();
        String abc=obj.stripXSS("null%27%22%3E%3Ciframe+id%3D1791+src%3Dhttp%3A%2F%2Fdemo.testfire.net%2Fphishing.html%3");
        System.out.println(abc);
    }
    public String stripXSS(String value) {
        if (value != null) {

            // Avoid anything between script tags
            Pattern scriptPattern = Pattern.compile("<script>(.*?)</script>", Pattern.CASE_INSENSITIVE);
            value = scriptPattern.matcher(value).replaceAll("");

            // Avoid anything in a src='...' type of expression
            scriptPattern = Pattern.compile("src[\r\n]*=[\r\n]*\\\'(.*?)\\\'",
                    Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL);
            value = scriptPattern.matcher(value).replaceAll("");

            // Avoid anything in a src="..." type of expression
            scriptPattern = Pattern.compile("src[\r\n]*=[\r\n]*\\\"(.*?)\\\"",
                    Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL);
            value = scriptPattern.matcher(value).replaceAll("");

            // Avoid anything in a src=... type of expression added because
            // quotes are not necessary
            scriptPattern = Pattern.compile("src[\r\n]*=[\r\n]*(.*?)",
                    Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL);
            value = scriptPattern.matcher(value).replaceAll("");

            // Remove any lonesome <script ...> tag
            scriptPattern = Pattern.compile("</script>", Pattern.CASE_INSENSITIVE);
            value = scriptPattern.matcher(value).replaceAll("");

            // Remove any lonesome <script ...> tag
            scriptPattern = Pattern.compile("<script(.*?)>",
                    Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL);
            value = scriptPattern.matcher(value).replaceAll("");

            // Avoid eval(...) expressions
            scriptPattern = Pattern.compile("eval\\((.*?)\\)",
                    Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL);
            value = scriptPattern.matcher(value).replaceAll("");

            // Avoid expression(...) expressions
            scriptPattern = Pattern.compile("expression\\((.*?)\\)",
                    Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL);
            value = scriptPattern.matcher(value).replaceAll("");

            // Avoid javascript:... expressions
            scriptPattern = Pattern.compile("javascript:", Pattern.CASE_INSENSITIVE);
            value = scriptPattern.matcher(value).replaceAll("");

            // Avoid anything between script tags added - paranoid regex. note:
            // if testing local PREP this must be commented
            scriptPattern = Pattern.compile("<(.*?)[\r\n]*(.*?)>",
                    Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL);
            value = scriptPattern.matcher(value).replaceAll("");

            // Avoid anything between script tags added - paranoid regex
            scriptPattern = Pattern.compile("<script(.*?)[\r\n]*(.*?)/script>",
                    Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL);
            value = scriptPattern.matcher(value).replaceAll("");

            // Avoid anything between * tags like *(alert)* added
            scriptPattern = Pattern.compile("\\*(.*?)[\r\n]*(.*?)\\*",
                    Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL);
            value = scriptPattern.matcher(value).replaceAll("");

            // Avoid anything between + tags like +(alert)+ added
            scriptPattern = Pattern.compile("\\+(.*?)[\r\n]*(.*?)\\+",
                    Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL);
            value = scriptPattern.matcher(value).replaceAll("");

            // Prohibit lines containing = (...) added
            scriptPattern = Pattern.compile("=(.*?)\\((.*?)\\)",
                    Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL);
            value = scriptPattern.matcher(value).replaceAll("");

            scriptPattern = Pattern.compile("alert", Pattern.CASE_INSENSITIVE);
            value = scriptPattern.matcher(value).replaceAll("");

            // Avoid iframe
            scriptPattern = Pattern.compile("iframe", Pattern.CASE_INSENSITIVE);
            value = scriptPattern.matcher(value).replaceAll("");

        }
        return value;
    }
}

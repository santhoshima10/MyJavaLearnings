import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Variables {

    public static void main(String[] args){

        Pattern pattern = Pattern.compile("^[a-zA-Z]+\\s*[=]+\\s*[a-zA-Z]*[0-9]*");
        Matcher matcher = pattern.matcher("a = 7");
        System.out.println(matcher.matches());
    }
}

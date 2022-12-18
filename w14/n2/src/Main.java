import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv13118340");
        Matcher matcher = pattern.matcher("abcdefghijklmnopqrstuv13118340");
        boolean bool = matcher.matches();
        System.out.println(bool);
    }
}
import java.util.regex.Pattern;

abstract class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(" ");
        String[] words = pattern.split("ae vae ough");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
public class Shirt {
    private String[] strings;

    Shirt(String[] strings) {
        this.strings = strings;
    }

    @Override
    public String toString() {
        String buff = "";
        for (String string : strings) {
            buff += string + "\n";
        }
        return buff;
    }
}
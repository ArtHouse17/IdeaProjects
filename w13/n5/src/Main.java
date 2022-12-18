abstract class Main {
    public static void main(String[] args) {
        String strings = "+7913234586789";
        String string = "8913234586789";
        TelephoneNumber telephonenumber = new TelephoneNumber(strings);
        TelephoneNumber number = new TelephoneNumber(string);
        System.out.println(telephonenumber);
        System.out.println(number);
    }
}
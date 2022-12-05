package n9;

import n6.Printable;
import n7.Book;

public class tester {
    public static void main(String[] args) {
        Printable[] printables = new Printable[] {
                new Book("1+1"),
                new Magazine("Cosmopolitan"),
                new Book( 356, "Time"),
                new Magazine("Maxim", 45)
        };
        for (int i = 0; i < printables.length; i++){
            printables[i].print();
        }
    }
}

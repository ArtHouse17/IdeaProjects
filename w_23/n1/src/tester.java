import java.util.ArrayList;
import java.util.LinkedList;

public class tester {
    public static void main(String[] args) {
//        LinkedList
        arrayq<Integer> arrayQueue = new arrayq<>();
        for (int i = 0; i < 5; i++){
            arrayQueue.enqueue(i + 6);
        }
        System.out.println(arrayQueue.element());
    }
}
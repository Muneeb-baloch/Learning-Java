import java.util.ArrayDeque;
import java.util.Deque;

// Deque allows you to add and remove elements from both the front (head) and the back (tail)

public class JavaDequeInterface {
    public static void main(String[] args) {
        Deque<String> names = new ArrayDeque<>();
        names.add("Muneeb");
        names.add("Yousuf");
        names.add("Hammad");
        names.addFirst("Ubaid");
        names.addFirst("Ubaid"); // pre one will be pushed toward tail
        names.add("Hasssan chakka");

        System.out.println(names.peek());
        System.out.println(names);
        System.out.println(names.pollFirst());
        // Returns and removes the first element of the deque. return null is deque is empty
        names.pollLast(); // remove last element
        System.out.println(names);
    }
}

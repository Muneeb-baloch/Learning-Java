import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(1);
        queue.add(5);
        queue.add(1);

//        queue.remove(); // Java treats it as a value
//        queue.poll(); // use to remove the head of queue
//        queue.clear(); // remove all the values from the queue
//        System.out.println(queue);
          System.out.println(queue.element());  //throws exception if the queue is empty
          System.out.println(queue.peek());  // return null if the queue is empty
          System.out.println(queue.size()); // return the size
        Iterator<Integer> it = queue.iterator();


        while (it.hasNext()){
            int val = it.next();
            System.out.println(val);

        }


        for (int val : queue){ // we can iterate using enhance loop and using iterator as well
            // but here we have liited control over the queue shorter code
            System.out.println("Value " + val);
        }







    }
}

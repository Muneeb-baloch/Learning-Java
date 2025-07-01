// Use of Iterator using List
// we use iterator in List, Set, Queue, Deque and Map (through entrySet, keySet, or values)

import java.util.*;

public class DemoIterator {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Muneeb ur rehman"); // adding the element in the list
        names.add("Yousuf");
        names.add("ubaid");
        names.add("usiad");
        names.add("Karan");

        // Iterator starts from here
        Iterator<String> nameslist = names.iterator();
        while (nameslist.hasNext()) { // has next return the true or false for the list

            String val = nameslist.next(); // objet.next return the next value from list
            if(val.equals("Muneeb ur rehman")){ // comparing the value from val
                nameslist.remove();  // removing element from the  list

            } else   System.out.println(val); // print the remaining elements of List

            // we use enahance for loop as well but we dont have proper controll on it
            // we can triverse backwards as well
            //


            Set<String> set = new HashSet<>(); // use of Iterator in Set
            set.add("A");
            set.add("B");

            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }

            Map<String, Integer> map = new HashMap<>(); // use of iterator in Map
            map.put("A", 1);
            map.put("B", 2);

            Iterator<Map.Entry<String, Integer>> itt = map.entrySet().iterator();



        }
    }
}



//Map is the collection of values and key pairs
// Map does't follow any sequence

import java.util.HashMap;
import java.util.Map;
public class DemoMap {
    public static void main(String[] args) {
        Map<String, Integer> student = new HashMap<>();

        student.put("Muneeb", 77); // taking input in Map
        student.put("Yousuf", 100);
        student.put("Ubaid", 85);
        student.put("Hammad", 94);
        student.putIfAbsent("Muneeb", 99); // this will add the value in map if the value is
        // is not present in the Map

        System.out.println(student);
       // System.out.println(student.get("Muneeb"));

        for (String names : student.keySet()){
            System.out.println(names);
            System.out.println(student.get(names));

        }
    }
}

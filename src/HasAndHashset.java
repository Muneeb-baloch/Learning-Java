import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
// Set is mutable and can't contain duplicates and dose't follow any order

public class HasAndHashset {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Blackberry");
        fruits.add("Bluekberry");
        fruits.add("Watermelon");
        fruits.add("Apricot");
        fruits.add("Lychee");
        fruits.add("Banana"); // Set can't Contain duplicates
        System.out.println(fruits);
        System.out.println(fruits.size()); // we check the using setname.size()
        System.out.println(fruits.contains("Apple")); // check does this String existed or not
        fruits.remove("Apple");
        System.out.println(fruits);

        Set<String> fruits2 = Set.of("Apple1", "Banana1", "Cherry"); // in Set.of we can just read and iterate the vales
        // its does't allow us to add remove or replace values
        // and can't contain duplicate it will through error during run time
        System.out.println(fruits2);

        // convertion of Set into List

        List<String> list = new ArrayList<>();
        list.add(fruits.toString());
        System.out.println(list + " List output");


        fruits.clear();// this will clear the set

    }

}

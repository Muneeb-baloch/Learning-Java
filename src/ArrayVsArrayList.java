import java.util.ArrayList;
import java.util.Arrays;

//Arrays are immutable means we can't change the size of it
// Arrays use fields nd ArraysList use method

class DemoArray{

    String [] friendlist = new String[4];
    String [] friendlist2 = {"Muneeb", "Yousuf", "Ubaid Javaid", "Ahsan Ullah"};

}

class DemoArrayList{
    ArrayList<String>  friendArrayList =
            new ArrayList<>(Arrays.asList("Muneeb1", "Yousuf1", "Ubaid Javaid1", "Ahsan Ullah1"));
    ArrayList<String>  friendArrayList2 = new ArrayList<>(); // Do not have fixed size in Array List
    //in Array List we use method

}


public class ArrayVsArrayList {


    public static void main(String[] args) {
        DemoArray d1 = new DemoArray();
        System.out.println(d1.friendlist2[1]); // here we have use field

        System.out.println(d1.friendlist2.length);
        DemoArrayList d2 = new DemoArrayList();

        System.out.println(d2.friendArrayList.get(1)); // here we called the method to get the index
        System.out.println(d2.friendArrayList.size());

        d2.friendArrayList.add("idot"); // we can do that in Array
        System.out.println("new Size " + d2.friendArrayList.size());

        // Set value for Array
        d1.friendlist2[1] = "noob";
        System.out.println(d1.friendlist2[1]);

        // Set Value for Array List
        d2.friendArrayList.set(1, "noob1");
        System.out.println(d2.friendArrayList.get(1));

        //remove element
        // can't do with this array
        d2.friendArrayList.remove("Noob1"); // we can remove using object and index as well in Array List



    }


}

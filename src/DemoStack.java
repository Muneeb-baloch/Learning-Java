import java.util.Iterator;
import java.util.Stack;

//its follows LIFO  only can be add or remove from top



public class DemoStack {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Muneeb"); //adding the element in the Stack
        stack.push("Ali");
        stack.push("yousuf");
        stack.push("hassan Chakka");
        stack.push("Ubaid gabro");
        stack.push("Asad Ali");

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.search("faroqq"));
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack);

        for (String names : stack) {
            System.out.println(names);
        }
        Iterator<String> it = stack.iterator();
        while (it.hasNext()) {
            String val = it.next();
            System.out.println(val);
            if (val.equals("Muneeb"));
            System.out.println("Muneeb is good boy");
            break;

            }
        }
    }



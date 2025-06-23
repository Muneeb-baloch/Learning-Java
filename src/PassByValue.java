//Pass by Value Example


public class PassByValue {

    public static void main(String[] args) {
        int a =2500; // we have taken one variable and stored the number 2500;
        System.out.println(a);
        int b =a;           // then we assign the value of a into b
        System.out.println(b); // the result is same for the b and a
        b = 2400;               // change the value b
        System.out.println(b); // printed b the value of b is now changes to 2400 before it was 2500
        System.out.println(a); // a remain same and no change in a
    }
}

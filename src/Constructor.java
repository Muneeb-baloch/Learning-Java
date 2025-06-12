public class Constructor {

    int age;
    String name;

    private Constructor () {
        System.out.println("this is private constructor ");
    }

    public static void main(String[] args) {
        Constructor const1 = new Constructor();
    }
}

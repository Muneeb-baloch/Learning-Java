//Like we have obj b1, b2, b3
// b1 is holding Integer, b2 is holding String, b3 Double data type
public class DemoGenerics {
    public static void main(String[] args) {

        box<Integer>  b1 = new box<>();
        b1.setValue(25);
        System.out.println(b1.getValue());

        box<String> b2 = new box<>();
        b2.setValue("Muneeb");
        System.out.println(b2.getValue());

        box<Double> b3 = new box<>();
        b3.setValue(25555d);
        System.out.println(b3.getValue());





    }
}

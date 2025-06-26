// Staic Block and instance block-- Purpose of static block is to initalize static data (class-level variables)
//when the class is laoded into memory even before any obj created or any method is called.
// like we have static name for Mobile and its class level variable
// and other are brand and price these are constructor its run when we create obj1
// class level variable only called once due to static kw does't matter how many obj we have
// in line 33 we have called the static variable without obj creation because it was loaded before any obj called.
// instace block is link with obj if you have 2 obj it will be called two times
class DemoMobile{
    String brand;
    int price;
    static  String name;

    public  DemoMobile (){ // consider this as a instance block
         brand = "";
         price = 200;
        System.out.println("Demo Mobile Details");

    }

    static {
        name = "Phone";
        System.out.println("static Name");
    }

}

public class DemoStaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
//        DemoMobile mob1 = new DemoMobile();
//        DemoMobile mob2 = new DemoMobile();
        Class.forName("DemoMobile");


    }
}

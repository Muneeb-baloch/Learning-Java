// Upcasting means converting smaller Data type to ---> Higher Data Type
// UpCasting int to double,float..
// DownCasting means Converting Higher Data Type to --> Lower Data Type
//DownCasting means double to int...

class DemoParent{

    String name = "Muneeeb";

    void m1 (){
        System.out.println("this is m1 from Parent class" );


    }
}

class DemoChild extends DemoParent {

    int id = 2525;

    void m2(){
        System.out.println("this is m2 from child class");
    }
}
public class DemoUpandDownCasting {
    public static void main(String[] args) {

      /*   DemoParent p = new DemoChild(); // upCasting in obj
       // we can only accces ref variable Data in upcasting
        // like there is DemoParent class ref so we can only access parents class method and fields
        System.out.println(p.name);
        p.m1();
        */


        // down casting
        DemoParent p = new DemoChild();
        DemoChild c = (DemoChild) p;
        System.out.println(p.name);
        System.out.println(c.id);
        p.m1();
        c.m2();













































        // converting smaller to larger --> UpCasting --> Done Automatically
   /*    int intvalue = 5;
        double doublevalue = intvalue;
        System.out.println(doublevalue);          */

        // Converting larger to smaller --> downcasting --> Manually
//        double doublevalue = 5.0;
//        int intvalue = (int)doublevalue;
//        System.out.println(intvalue);

    }
}

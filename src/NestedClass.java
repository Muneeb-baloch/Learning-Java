public class NestedClass {
    class outer{
        class inner{
            int age;
            String name;
            String fathername;
            void show(){
                System.out.println(name);
                System.out.println(age);
                System.out.println(fathername);
            }
        }
    }
    // we can"t directly access method we have to create obj
    // of each class so we can access methods and attributes
    // if the value is not assigned in the String by the obj by default return null; and 0 for int

    public static void main(String[] args) {
        // Object creation
        // Nestedclass is the class name
        // mostouter is obj name
        // new NestedClass () this will call the constructor of this class
       NestedClass mostouter = new NestedClass();
        // NestedClass.outer is the ref for outer class
        // outerobj is the obj name
        // mostouter is the obj of NestedClass
        // .new outer this will create the obj of outer class
       NestedClass.outer outerobj = mostouter.new outer();
        // outer.inner is the ref for outer class
        // inner obj is the obj name
        // outerobj is the obj of outer clss
        // .new inner this will create the obj of inner class
       outer.inner innerobj  = outerobj.new inner();
       // innerobj.name,age will assign the value to the attributes
        innerobj.name ="Muneeb";
        innerobj.age = 25;
        //this will call the method present in inner class
        innerobj.show();
    }
}

// Instanceof Operator use.
// This is use to check the type of object at run time
// Even if reference declared of parent type the object it refers to might be a child
// Prevent ClassCastException when downcasting
// Before downcasting an object, we should use instanceof to make sure it’s safe.
abstract class DemoAnimals {
     abstract void Animaltype();
     void pirnt(){
         System.out.println("this is DemoAnimal class");
     }

}

class DemoDog extends  DemoAnimals{

    void Animaltype(){
        System.out.println("This is dog ");
    }

}
class DemoCat extends  DemoAnimals {

    void Animaltype(){
        System.out.println("This is Cat ");
    }

}

public class DemoInstanceOF {
    public static void main(String[] args) {

//        DemoCat c1 = new DemoCat();
//        System.out.println(c1 instanceof DemoAnimals);
//        c1.Animaltype();


            DemoAnimals a =  new DemoDog(); // upCasting always safe
            if (a instanceof DemoDog) {
                DemoDog d = (DemoDog) a; // downcasting
                d.Animaltype();
                d.pirnt();
            }

    }
}

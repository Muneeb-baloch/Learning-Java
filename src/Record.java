// Exampe of Record
// record include all the method needed like setter, getter, .equal() method, hashcode,

//import javax.lang.model.element.Name;
//import java.util.Objects;
//
//class Alien {
//  private final int id;
//   private final String name;
//
//    public Alien(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//    public int getid() {
//        System.out.println(id);
//        return id;
//    }
//    public String getName(){
//        System.out.println(name);
//        return name;
//}
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Alien alien = (Alien) o;
//        return id == alien.id && Objects.equals(name, alien.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
//
//    @Override
//    public String toString() {
//        return "Alien{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }
//
//    public static void main(String[] args) {
//        Alien a = new Alien (22, "Muneeb");
//        Alien a1 = new Alien (22, "Muneeb");
//        a.getName();
//        a.getid();
//        System.out.println(a.equals(a1));
//        }
//
//    }


record Alien (int id, String Name){}

public class Record {
    public static void main(String[] args) {

        Alien a1 = new Alien(2205804, "Muneeb ur Rehman");
        Alien a2 = new Alien(2205804, "Muneeb ur Rehman");

        System.out.println(a1.equals(a2)); // we can directly compare the value of object in record
        // before in the class we have to override the .equal function example is in above code. line no 25


    }


}


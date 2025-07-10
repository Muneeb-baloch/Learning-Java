// Method Chaining
// Method chaining reduces the need to write the same variable repeatedly.
// method must return this and type of method must be class or returning class
// if you  want to print object directly need to convert to String
class DemoStudent {
    String name;
    String city;
    int age;

    public DemoStudent setName(String name) {
        this.name = name;
        return this;
    }

    public DemoStudent setCity(String city) {
        this.city = city;
        return this;
    }

    public DemoStudent setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "DemoStudent{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }
}


public class DemoMethodChaining {


    public static void main(String[] args) {

        DemoStudent s = new DemoStudent();
        System.out.println(s.setAge(25).setCity("Lahore").setName("Muneeb"));



    }
}


class Student {

    String name;
    int age;


    public  void printinfo(){
        System.out.println(name);
        System.out.println(age);
    }

}

public class OPP {

    public static void main(String[] args) {
    Student s1 = new Student();
    s1.name ="Muneeb ur rehman";
    s1.age  = 25;

    s1.printinfo();

    }



}

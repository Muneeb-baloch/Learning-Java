//Method Chaining in java
class Std{
    String name ;
    int age;
    int grade;
    public  Std  setName(String name){
        this.name = name;
        return  this;
    }
    public  Std  setAge(int age){
        this.age = age;
        return  this;
    }
    public  Std  setGrade(int grade){
        this.grade = grade;
        return this;
    }
    public  Std   getGrade(){

        System.out.println(grade);
        return  this;
    }
    public  Std   getname(){
        System.out.println(name);
        return  this;

    }
    public  Std   getage(){
        System.out.println(age);
return  this;
    }

}


public class MethodChaining {
    public static void main(String[] args) {
        Std student1 = new Std();
            student1.setName("Alpha").setAge(25).setGrade(77); //Multiple methods are using in one line

//        System.out.println(student1.name);
//        System.out.println(student1.age);
//        System.out.println(student1.grade);
            student1.getname();
            student1.getGrade();
            student1.getage();



    }
}

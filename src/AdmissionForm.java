import java.security.PublicKey;

public class AdmissionForm {

    private  String name;
    private  String city;
    private  String department;
    private  int age;
    private String email;



    private AdmissionForm(){

    }

    public String getName() {
        return name;
    }


    public String getCity() {
        return city;
    }

    public AdmissionForm setCity(String city) {
        this.city = city;
        return this;
    }

    public String getDepartment() {
        return department;
    }



    public int getAge() {
        return age;
    }

    public AdmissionForm setAge(int age) {
        this.age = age;
        return this;
    }

    public String getEmail() {
        return email;
    }


    private AdmissionForm (FormBuilder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.city = builder.city;
        this.department =builder.department;


    }

    @Override
    public String toString() {
        return "AdmissionForm{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    public static class FormBuilder{
        //Mandatory Fields
        private  String name;
        private String email;
        private  String department;

        // optional
        private  String city;
        private  int age;


        public FormBuilder (String name, String email, String department){

            this.name = name;
            this.department = department;
            this.email = email;

        }

        public FormBuilder setCity(String city) {
            this.city = city;
            return  this;
        }

        public FormBuilder setAge(int age) {
            this.age = age;
            return this;



        }

        public String getDepartment() {
            return department;
        }

        public String getCity() {
            return city;
        }

        public int getAge() {
            return age;
        }



       public AdmissionForm buildform (){
            return  new AdmissionForm(this);
        }
    }

}

public class ProductTest {
    public static void main(String[] args) {

     Product p1 = new Product.ProductBuilder(15000, "Iphone11").build();
     System.out.println(p1);




     AdmissionForm form1 = new AdmissionForm.FormBuilder("Muneeb", "muneebclan@gmail.com","CS").buildform();
        System.out.println(form1);
        form1.setAge(25).setCity("Lahore");
//        form1.setCity("Lahoer");
//        form1.setAge(26);
        System.out.println(form1);


    }




}

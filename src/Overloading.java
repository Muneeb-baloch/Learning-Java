public class Overloading {
// Method overloading means same name method but with different parameters
    // like we have in this short program add. 2 add methods are here and one accept
    // 3 parameters and other is accepting 2 parameters.
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        Overloading.Calculator obj2 = obj.new Calculator(); // here we are using Nested Class concept
       int r =  obj2.add(5,15);
        System.out.println(r);

    }

    public class Calculator{

        public int add(int n1, int n2, int n3){
            return n1+n2+n3;
        }
        public int add(int n1, int n2 ){
            return n1+n2;
        }



    }


}

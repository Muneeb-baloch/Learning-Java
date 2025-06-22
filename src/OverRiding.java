// Method OverRiding
// in Method OverRiding we used inheritence
// if we have same name method the priorty given to class method

public class OverRiding {

    public static void main(String[] args) {

        OverRiding obj = new OverRiding();
        OverRiding.Calculator obj1 = obj.new Calculator();
        Calculator.AdvCalculator obj2 = obj1.new AdvCalculator();

        int r = obj2.add(16, 25, 79);
        int r1= obj2.mul(55,45,55);
        System.out.println(r +" Add operation" );
        System.out.println(r1 + " Mul operation");




    }


    public class Calculator{

        public int add(int n1, int n2, int n3){
            return  n1 + n2 + n3;

        }

        public int mul(int n1, int n2, int n3){
            return  n1 * n2 * n3;


        }

        public  class  AdvCalculator extends  Calculator{


            public int add(int n1, int n2, int n3){
                return  n1 + n2 + n3 ;

            }

//            public int mul(int n1, int n2){
//                return  n1 * n2 ;
//
//            }


        }


    }
}

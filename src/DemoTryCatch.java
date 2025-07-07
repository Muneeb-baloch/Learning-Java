// Exception handling is used to hadndle Run Time errors
// we use try catch block to handle
// if try block didn't work then catch block will be executed.
// we can use different type of exceptions like ArithmeticException, ArrayIndexOutOfBoundsException
// if we know the type of runtime error occour we use known type for other we can use Exception this
// can handle all type of exceptions.
// Hierarchy --> obj --> Throwable --> into two class error and Exception --> Run time Exception, SQL Exception, I/O Exception
//Unchecked Exception --> Arthimetic, Null, outofbound
// Checked Exception mandatory to handle --> SQL, I/O Exception


public class DemoTryCatch {
    public static void main(String[] args) {
        int i =0;
        int res = 18;
        int nums[] = new int[5];
        String str = null;
        try{
             res = 18/i;
            System.out.println(nums[0]);
            System.out.println(nums[7]);
            System.out.println(str.length());
        }
        catch (ArithmeticException e){

            System.out.println("you can't divide number by zero " + e);
        }
        catch (ArrayIndexOutOfBoundsException e ){
            System.out.println(" please be in your limits");

        }
        catch (Exception e){
            System.out.println("something went wrong " + e);

        }

        System.out.println(res);
        System.out.println("bye with smile");

    }
}

class muneebException extends Exception {
    muneebException(String str) {
        super(str);  // This stores the message
    }
}

public class CustomException {
    public static void main(String[] args) {
        int i = 1;
        int res = 18;

        try {
            res = 18 / i;
            if (res == 18) {
                throw new muneebException("I don't want result to be 18");
            }
        } catch (muneebException ME) {

            System.out.println("this is default value" + ME);
        }
    }
}

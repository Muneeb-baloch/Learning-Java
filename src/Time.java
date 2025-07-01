import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Time {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println(currentDate);

        SimpleDateFormat timeformat = new SimpleDateFormat("hh, mm, ss");
        System.out.println(timeformat.format(currentDate));
        System.out.println(currentDate);
        SimpleDateFormat DateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(DateFormat.format(currentDate));

    }


}

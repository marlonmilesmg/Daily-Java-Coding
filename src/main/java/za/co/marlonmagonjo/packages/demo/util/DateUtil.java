package za.co.marlonmagonjo.packages.demo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    private static final String DATE_FORMAT = "dd/MM/yyyy";
    public static String formartDate(Date d){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT);
        return simpleDateFormat.format(d);
    }
}

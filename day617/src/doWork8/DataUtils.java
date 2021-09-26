package doWork8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtils {
    public static String DataToString(Date data,String format){
        SimpleDateFormat s =new SimpleDateFormat(format);
        return s.format(data);
    }
    public static Date StringToDate(String date,String s1) throws ParseException {
        SimpleDateFormat ss =new SimpleDateFormat(s1);
        Date parse = ss.parse(date);
        return parse;
    }

}

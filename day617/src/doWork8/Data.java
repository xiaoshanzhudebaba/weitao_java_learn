package doWork8;

import java.text.ParseException;
import java.util.Date;

public class Data {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println();
        String s2 = DataUtils.DataToString(d,"yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s2);

        d =  DataUtils.StringToDate(s2,"yyyy年MM月dd日 HH:mm:ss");
        System.out.println(d);
    }
}

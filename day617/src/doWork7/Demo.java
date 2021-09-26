package doWork7;

import javafx.scene.input.DataFormat;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws ParseException {
//        String s = "100";
//        int i = 100;
//        String s1 =String.valueOf(i);
//        int i1 =Integer.valueOf(s);
//        System.out.println(s1);
//        System.out.println(i1);
//
        Date d = new Date();
        System.out.println(d);

        long date = 1000*60*60*3;
        Date d1 = new Date(date);
        System.out.println(d1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        System.out.println(sdf.format(d));

        String source  = "2012年12月12日 12:12:12";
        System.out.println("当前时间的标准格式为：");
        System.out.println(sdf.parse(source));

    }
}

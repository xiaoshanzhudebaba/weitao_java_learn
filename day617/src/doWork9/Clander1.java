package doWork9;

import java.util.Calendar;
import java.util.Scanner;

public class Clander1 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);
        System.out.println(year+"年"+month+"月"+date+"日");

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份");
        int i = sc.nextInt();
        c.set(i,2,1);
        c.add(Calendar.DATE,-1);
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        date = c.get(Calendar.DATE);
        System.out.println(year+"年2月有"+date+"天");
        int x = c.get(Calendar.MONTH);
    }
}

package doWork20;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArgsDemo {
    public static void main(String[] args) {
        List<? extends Serializable> serializables = Arrays.asList("傻逼", 123, 444, 153.5, "可以哦");//通过Arrays.asList方法实现的可变参数集合，集合长度不可改变，内容可变。


        System.out.println(serializables);
        System.out.println( num(123,456,987));
    }
    public static int num(int ...a){
        int num = 0;
        for (int i : a){
            num +=i;
        }
        return num;
    }
}

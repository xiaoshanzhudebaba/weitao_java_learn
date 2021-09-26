package doWork10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        Collection<Student> s =new ArrayList<Student>();

        Student s1 =new Student("梁小灵",38);
        Student s2 =new Student("韦涛",18);
        s.add(s1);
        s.add(s2);
        Iterator<Student> a = s.iterator();
        while (a.hasNext()){
            Student z =a.next();
            System.out.println(z.getName()+","+z.age);
        }
    }
}

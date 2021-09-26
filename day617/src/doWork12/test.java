package doWork12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Student> s = new ArrayList<Student>();
        Student s1= new Student("梁灵",23);
        Student s2= new Student("韦涛",23);
        s.add(s1);
        s.add(s2);
        Iterator<Student> iterator = s.iterator();
        while (iterator.hasNext()){
            Student s3 = iterator.next();
            System.out.println(s3.getName()+","+s3.getAge());
        }
        for (int i=0 ;i<s.size();i++){
            Student s3 = s.get(i);
            System.out.println(s3.getName()+","+s3.getAge());
        }
        for(Student s3 : s ){
            System.out.println(s3.getName()+","+s3.getAge());
        }
    }
}

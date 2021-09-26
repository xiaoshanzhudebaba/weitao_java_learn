package doWork15;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();

        Student s1 = new Student("奋斗",100);
        Student s2 = new Student("坚持",101);
        Student s3 = new Student("梁灵",23);
        Student s4 = new Student("韦涛",18);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        for (Student s :ts){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}

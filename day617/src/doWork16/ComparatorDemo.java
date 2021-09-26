package doWork16;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int i = s1.getAge() - s2.getAge();
                int num = i == 0 ? s1.getName().compareTo(s2.getName()) : i;
                return num;
            }
        });

        Student s1 = new Student("奋斗", 100);
        Student s2 = new Student("坚持", 101);
        Student s3 = new Student("梁灵", 23);
        Student s4 = new Student("韦涛", 18);
        Student s5 = new Student("种地", 100);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        for (Student s : ts) {
            System.out.println(s.getName() + "," + s.getAge());
        }

    }
}

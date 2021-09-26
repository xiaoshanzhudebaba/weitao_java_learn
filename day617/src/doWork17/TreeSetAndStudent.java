package doWork17;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetAndStudent<ts> {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s2.num() - s1.num();
                int num2 = num==0?s2.getChinese()-s1.getChinese():num;
                int num3 = num2 ==0?s1.getName().compareTo(s2.getName()):num2;
                return num3;
            }
        });
        Student s1 = new Student("梁灵",99,78);
        Student s2 = new Student("韦涛",100,100);
        Student s3 = new Student("梁小灵",89,88);
        Student s4 = new Student("韦帅涛",100,100);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        for(Student s : ts){
            System.out.println(s.getName()+","+s.num());
        }
    }

}

package doWork14;
import java.util.HashSet;
public class  HashSet1<S> {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<Student>();
        Student s1 = new Student("梁灵", 23);
        Student s2 = new Student("韦涛", 23);
        Student s3 = new Student("还有一个家", -3);
        Student s4 = new Student("还有一个家", -3);
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        for (Student s : hs){
            System.out.println(s.getName()+","+s.age);
        }
    }


}
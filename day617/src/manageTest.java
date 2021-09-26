import com.sun.deploy.security.SelectableSecurityManager;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Scanner;

public class manageTest {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();

            switch (s) {
                case "1":
                    addStudent(array);
                    System.out.println("添加学生成功");
                    break;
                case "2":
                    deleteStudent(array);
                    break;
                case "3":
                    modifyStudent(array);
                    System.out.println("修改学生成功");
                    break;
                case "4":
                    viewAllInformation(array);
                    System.out.println("查看所有学生成功");
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    System.exit(0);
                    break;
            }
        }
    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        String sid;
        while (true) {
            System.out.println("请输入学号：");
            sid = sc.nextLine();
            if (isUsed(array, sid)) {
                System.out.println("此学号已被占用");
            } else {
                break;
            }

        }
        System.out.println("请输入姓名：");
        String name = sc.nextLine();
        System.out.println("请输入年龄：");
        String age = sc.nextLine();
        System.out.println("请输入住址：");
        String address = sc.nextLine();
        Student s = new Student();
        s.setSid(sid);
        s.setAge(age);
        s.setName(name);
        s.setAddress(address);
        array.add(s);
    }

    public static void viewAllInformation(ArrayList<Student> array) {
        System.out.println("学号\t姓名\t年龄\t住址");

        if (array.size() == 0) {
            System.out.println("没有存入信息");
        } else {
            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());
            }
        }
    }

    public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        a:
        while (true) {
            if(array.size()==0){
                System.out.println("没有可以删除的对象");
                break a;
            }
            System.out.println("请输入要删除的学生学号");
            String sid = sc.nextLine();

            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                if (s.getSid().equals(sid)) {
                    array.remove(i);
                    System.out.println("删除学生成功");
                    break a;
                } else {
                    System.out.println("你输入的号码不存在");
                    break a;
                }
            }

        }

    }

    public static void modifyStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        a:
        while (true) {
            System.out.println("请输入学生学号");
            String sid = sc.nextLine();
            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                if (s.getSid().equals(sid)) {
                    System.out.println("请输入改正后的学号：");
                    sid = sc.nextLine();
                    s.setSid(sid);
                    System.out.println("请输入改正后的名字：");
                    String name = sc.nextLine();
                    s.setName(name);
                    System.out.println("请输入改正后的年龄：");
                    String age = sc.nextLine();
                    s.setAge(age);
                    System.out.println("请输入改正后的地址：");
                    String address = sc.nextLine();
                    s.setAddress(address);
                    break a;
                } else {
                    System.out.println("没有你输入的学号");
                }
            }

        }
    }

    public static boolean isUsed(ArrayList<Student> array, String sid) {
        boolean flag = false;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                flag = true;
            }
        }
        return flag;
    }
}

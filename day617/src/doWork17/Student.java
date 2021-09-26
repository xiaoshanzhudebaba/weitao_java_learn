package doWork17;

public class Student {
    String name;

    int chinese;
    int math;

    public Student(String name, int chinese, int math) {
        this.name = name;

        this.chinese = chinese;
        this.math = math;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  int num(){
        int i = getChinese() + getMath();
        return i;
    }


}

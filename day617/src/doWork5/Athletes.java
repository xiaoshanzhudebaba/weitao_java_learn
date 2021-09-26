package doWork5;

public abstract class Athletes extends Person {
    public Athletes() {
    }

    public Athletes(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("运动员吃健身餐");
    }
    public abstract void playTable();
}

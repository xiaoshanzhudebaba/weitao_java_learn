package doWork5;

public abstract class Coach extends Person{
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("随便吃");
    }
    public abstract void teach();

}

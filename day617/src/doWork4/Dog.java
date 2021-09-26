package doWork4;

public class Dog extends Animal implements Jumpping{

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void jump() {
        System.out.println("经过训练后狗会跳起来了");
    }
}

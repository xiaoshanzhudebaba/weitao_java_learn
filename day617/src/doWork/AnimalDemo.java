package doWork;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class AnimalDemo {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.setName("加菲猫");
        c.setAge(3);
        System.out.println(c.getName() + "," + c.getAge());
        c.catchMouse();

        Cat s = new Cat("加菲猫", 3);
        System.out.println(s.getName() + "," + s.getAge());
        c.catchMouse();

        Dog d = new Dog();
        d.setName("中华田园犬");
        d.setAge(10);
        System.out.println(d.getName() + "," + d.getAge());

        d.lookDoor();

        Dog d1 = new Dog("中华田园犬", 10);

        System.out.println(d1.getName() + "," + d1.getAge());
        d1.lookDoor();


    }
}
